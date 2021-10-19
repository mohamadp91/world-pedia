package com.xper.worldpedia.configuration;


import com.xper.worldpedia.models.WorldEntity;
import com.xper.worldpedia.models.WorldModelInput;
import com.xper.worldpedia.processor.WorldInfoProcessor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;


    private final String[] FIELDS_NAMES = new String[]{
            "country",
            "area",
            "birth_rate",
            "death_rate",
            "current_account",
            "debt_external",
            "electricity_consumption",
            "electricity_production",
            "exports",
            "GDP",
            "GDP_per_capita",
            "GDP_real_growth_rate",
            "HIV_AIDS_adult",
            "HIV_AIDS_deaths",
            "HIV_AIDS_living",
            "highways",
            "railways",
            "imports",
            "industrial_production",
            "infant_mortality",
            "inflation_rate",
            "internet_hosts",
            "internet_users",
            "investment_oss_fixed",
            "labor_force",
            "life_expectancy",
            "military_expenditures_dollar",
            "military_expenditures_percent",
            "natural_gas_consumption",
            "natural_gas_exports",
            "natural_gas_imports",
            "natural_gas_production",
            "natural_gas_reserves",
            "oil_consumption",
            "oil_export",
            "oil_import",
            "oil_production",
            "oil_reserves",
            "population",
            "public_debt_of_GDP",
            "reserves_of_foreign_gold",
            "telephones_main_lines",
            "telephones_mobile_cellular",
            "total_fertility_rate",
            "unemployment_rate",
    };

    @Bean
    public FlatFileItemReader<WorldModelInput> reader() {

        return new FlatFileItemReaderBuilder<WorldModelInput>()
                .name("CarItemReader")
                .resource(new ClassPathResource("factbook.csv"))
                .delimited()
                .delimiter(";")
                .names(FIELDS_NAMES)
                .fieldSetMapper(new BeanWrapperFieldSetMapper<WorldModelInput>() {{
                    setTargetType(WorldModelInput.class);
                }})
                .build();
    }

    @Bean
    public WorldInfoProcessor processor() {
        return new WorldInfoProcessor();
    }

    @Bean
    public JdbcBatchItemWriter<WorldEntity> writer(DataSource dataSource) {
        return new JdbcBatchItemWriterBuilder<WorldEntity>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql("INSERT INTO world (country,area,birth_rate,death_rate,current_account,debt_external,electricity_consumption,electricity_production,exports,GDP,GDP_per_capita,GDP_real_growth_rate,HIV_AIDS_adult,HIV_AIDS_deaths,HIV_AIDS_living,highways,railways,imports,industrial_production,infant_mortality,inflation_rate,internet_hosts,internet_users,investment_oss_fixed,labor_force,life_expectancy,military_expenditures_dollar,military_expenditures_percent,natural_gas_consumption,natural_gas_exports,natural_gas_imports,natural_gas_production,natural_gas_reserves,oil_consumption,oil_export,oil_import,oil_production,oil_reserves,population,public_debt_of_GDP,reserves_of_foreign_gold,telephones_main_lines,telephones_mobile_cellular,total_fertility_rate,unemployment_rate) " +
                        "VALUES (:country,:area,:birth_rate,:death_rate,:current_account,:debt_external,:electricity_consumption,:electricity_production,:exports,:GDP,:GDP_per_capita,:GDP_real_growth_rate,:HIV_AIDS_adult,:HIV_AIDS_deaths,:HIV_AIDS_living,:highways,:railways,:imports,:industrial_production,:infant_mortality,:inflation_rate,:internet_hosts,:internet_users,:investment_oss_fixed,:labor_force,:life_expectancy,:military_expenditures_dollar,:military_expenditures_percent,:natural_gas_consumption,:natural_gas_exports,:natural_gas_imports,:natural_gas_production,:natural_gas_reserves,:oil_consumption,:oil_export,:oil_import,:oil_production,:oil_reserves,:population,:public_debt_of_GDP,:reserves_of_foreign_gold,:telephones_main_lines,:telephones_mobile_cellular,:total_fertility_rate,:unemployment_rate)")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public Job importUserJob(JobCompletionNotificationListener listener, Step step1) {
        return jobBuilderFactory.get("importUserJob")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(step1)
                .end()
                .build();
    }

    @Bean
    public Step step1(JdbcBatchItemWriter<WorldEntity> writer) {
        return stepBuilderFactory.get("step1")
                .<WorldModelInput, WorldEntity>chunk(10)
                .reader(reader())
                .processor(processor())
                .writer(writer)
                .build();

    }
}
