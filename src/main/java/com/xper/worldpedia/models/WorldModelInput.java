package com.xper.worldpedia.models;

import javax.persistence.*;

@Entity
@Table(name = "world")
public class WorldModelInput {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String country;
    private String area;
    private String birth_rate;
    private String death_rate;
    private String current_account;
    private String debt_external;
    private String electricity_consumption;
    private String electricity_production;
    private String exports;
    private String GDP;
    private String GDP_per_capita;
    private String GDP_real_growth_rate;
    private String HIV_AIDS_adult;
    private String HIV_AIDS_deaths;
    private String HIV_AIDS_living;
    private String highways;
    private String railways;
    private String imports;
    private String industrial_production;
    private String infant_mortality;
    private String inflation_rate;
    private String internet_hosts;
    private String internet_users;
    private String investment_oss_fixed;
    private String labor_force;
    private String life_expectancy;
    private String military_expenditures_dollar;
    private String military_expenditures_percent;
    private String natural_gas_consumption;
    private String natural_gas_exports;
    private String natural_gas_imports;
    private String natural_gas_production;
    private String natural_gas_reserves;
    private String oil_consumption;
    private String oil_export;
    private String oil_import;
    private String oil_production;
    private String oil_reserves;
    private String population;
    private String public_debt_of_GDP;
    private String reserves_of_foreign_gold;
    private String telephones_main_lines;
    private String telephones_mobile_cellular;
    private String total_fertility_rate;
    private String unemployment_rate;

    public WorldModelInput(String country, String area, String birth_rate, String death_rate, String current_account, String debt_external, String electricity_consumption, String electricity_production, String exports, String GDP, String GDP_per_capita, String GDP_real_growth_rate, String HIV_AIDS_adult, String HIV_AIDS_deaths, String HIV_AIDS_living, String highways, String railways, String imports, String industrial_production, String infant_mortality, String inflation_rate, String internet_hosts, String internet_users, String investment_oss_fixed, String labor_force, String life_expectancy, String military_expenditures_dollar, String military_expenditures_percent, String natural_gas_consumption, String natural_gas_exports, String natural_gas_imports, String natural_gas_production, String natural_gas_reserves, String oil_consumption, String oil_export, String oil_import, String oil_production, String oil_reserves, String population, String public_debt_of_GDP, String reserves_of_foreign_gold, String telephones_main_lines, String telephones_mobile_cellular, String total_fertility_rate, String unemployment_rate) {
        this.country = country;
        this.area = area;
        this.birth_rate = birth_rate;
        this.death_rate = death_rate;
        this.current_account = current_account;
        this.debt_external = debt_external;
        this.electricity_consumption = electricity_consumption;
        this.electricity_production = electricity_production;
        this.exports = exports;
        this.GDP = GDP;
        this.GDP_per_capita = GDP_per_capita;
        this.GDP_real_growth_rate = GDP_real_growth_rate;
        this.HIV_AIDS_adult = HIV_AIDS_adult;
        this.HIV_AIDS_deaths = HIV_AIDS_deaths;
        this.HIV_AIDS_living = HIV_AIDS_living;
        this.highways = highways;
        this.railways = railways;
        this.imports = imports;
        this.industrial_production = industrial_production;
        this.infant_mortality = infant_mortality;
        this.inflation_rate = inflation_rate;
        this.internet_hosts = internet_hosts;
        this.internet_users = internet_users;
        this.investment_oss_fixed = investment_oss_fixed;
        this.labor_force = labor_force;
        this.life_expectancy = life_expectancy;
        this.military_expenditures_dollar = military_expenditures_dollar;
        this.military_expenditures_percent = military_expenditures_percent;
        this.natural_gas_consumption = natural_gas_consumption;
        this.natural_gas_exports = natural_gas_exports;
        this.natural_gas_imports = natural_gas_imports;
        this.natural_gas_production = natural_gas_production;
        this.natural_gas_reserves = natural_gas_reserves;
        this.oil_consumption = oil_consumption;
        this.oil_export = oil_export;
        this.oil_import = oil_import;
        this.oil_production = oil_production;
        this.oil_reserves = oil_reserves;
        this.population = population;
        this.public_debt_of_GDP = public_debt_of_GDP;
        this.reserves_of_foreign_gold = reserves_of_foreign_gold;
        this.telephones_main_lines = telephones_main_lines;
        this.telephones_mobile_cellular = telephones_mobile_cellular;
        this.total_fertility_rate = total_fertility_rate;
        this.unemployment_rate = unemployment_rate;
    }

    public WorldModelInput() {
    }

    public WorldModelInput(String country) {
        this.country = country;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBirth_rate() {
        return birth_rate;
    }

    public void setBirth_rate(String birth_rate) {
        this.birth_rate = birth_rate;
    }

    public String getDeath_rate() {
        return death_rate;
    }

    public void setDeath_rate(String death_rate) {
        this.death_rate = death_rate;
    }

    public String getCurrent_account() {
        return current_account;
    }

    public void setCurrent_account(String current_account) {
        this.current_account = current_account;
    }

    public String getDebt_external() {
        return debt_external;
    }

    public void setDebt_external(String debt_external) {
        this.debt_external = debt_external;
    }

    public String getElectricity_consumption() {
        return electricity_consumption;
    }

    public void setElectricity_consumption(String electricity_consumption) {
        this.electricity_consumption = electricity_consumption;
    }

    public String getElectricity_production() {
        return electricity_production;
    }

    public void setElectricity_production(String electricity_production) {
        this.electricity_production = electricity_production;
    }

    public String getExports() {
        return exports;
    }

    public void setExports(String exports) {
        this.exports = exports;
    }

    public String getGDP() {
        return GDP;
    }

    public void setGDP(String GDP) {
        this.GDP = GDP;
    }

    public String getGDP_per_capita() {
        return GDP_per_capita;
    }

    public void setGDP_per_capita(String GDP_per_capita) {
        this.GDP_per_capita = GDP_per_capita;
    }

    public String getGDP_real_growth_rate() {
        return GDP_real_growth_rate;
    }

    public void setGDP_real_growth_rate(String GDP_real_growth_rate) {
        this.GDP_real_growth_rate = GDP_real_growth_rate;
    }

    public String getHIV_AIDS_adult() {
        return HIV_AIDS_adult;
    }

    public void setHIV_AIDS_adult(String HIV_AIDS_adult) {
        this.HIV_AIDS_adult = HIV_AIDS_adult;
    }

    public String getHIV_AIDS_deaths() {
        return HIV_AIDS_deaths;
    }

    public void setHIV_AIDS_deaths(String HIV_AIDS_deaths) {
        this.HIV_AIDS_deaths = HIV_AIDS_deaths;
    }

    public String getHIV_AIDS_living() {
        return HIV_AIDS_living;
    }

    public void setHIV_AIDS_living(String HIV_AIDS_living) {
        this.HIV_AIDS_living = HIV_AIDS_living;
    }

    public String getHighways() {
        return highways;
    }

    public void setHighways(String highways) {
        this.highways = highways;
    }

    public String getRailways() {
        return railways;
    }

    public void setRailways(String railways) {
        this.railways = railways;
    }

    public String getImports() {
        return imports;
    }

    public void setImports(String imports) {
        this.imports = imports;
    }

    public String getIndustrial_production() {
        return industrial_production;
    }

    public void setIndustrial_production(String industrial_production) {
        this.industrial_production = industrial_production;
    }

    public String getInfant_mortality() {
        return infant_mortality;
    }

    public void setInfant_mortality(String infant_mortality) {
        this.infant_mortality = infant_mortality;
    }

    public String getInflation_rate() {
        return inflation_rate;
    }

    public void setInflation_rate(String inflation_rate) {
        this.inflation_rate = inflation_rate;
    }

    public String getInternet_hosts() {
        return internet_hosts;
    }

    public void setInternet_hosts(String internet_hosts) {
        this.internet_hosts = internet_hosts;
    }

    public String getInternet_users() {
        return internet_users;
    }

    public void setInternet_users(String internet_users) {
        this.internet_users = internet_users;
    }

    public String getInvestment_oss_fixed() {
        return investment_oss_fixed;
    }

    public void setInvestment_oss_fixed(String investment_oss_fixed) {
        this.investment_oss_fixed = investment_oss_fixed;
    }

    public String getLabor_force() {
        return labor_force;
    }

    public void setLabor_force(String labor_force) {
        this.labor_force = labor_force;
    }

    public String getLife_expectancy() {
        return life_expectancy;
    }

    public void setLife_expectancy(String life_expectancy) {
        this.life_expectancy = life_expectancy;
    }

    public String getMilitary_expenditures_dollar() {
        return military_expenditures_dollar;
    }

    public void setMilitary_expenditures_dollar(String military_expenditures_dollar) {
        this.military_expenditures_dollar = military_expenditures_dollar;
    }

    public String getMilitary_expenditures_percent() {
        return military_expenditures_percent;
    }

    public void setMilitary_expenditures_percent(String military_expenditures_percent) {
        this.military_expenditures_percent = military_expenditures_percent;
    }

    public String getNatural_gas_consumption() {
        return natural_gas_consumption;
    }

    public void setNatural_gas_consumption(String natural_gas_consumption) {
        this.natural_gas_consumption = natural_gas_consumption;
    }

    public String getNatural_gas_exports() {
        return natural_gas_exports;
    }

    public void setNatural_gas_exports(String natural_gas_exports) {
        this.natural_gas_exports = natural_gas_exports;
    }

    public String getNatural_gas_imports() {
        return natural_gas_imports;
    }

    public void setNatural_gas_imports(String natural_gas_imports) {
        this.natural_gas_imports = natural_gas_imports;
    }

    public String getNatural_gas_production() {
        return natural_gas_production;
    }

    public void setNatural_gas_production(String natural_gas_production) {
        this.natural_gas_production = natural_gas_production;
    }

    public String getNatural_gas_reserves() {
        return natural_gas_reserves;
    }

    public void setNatural_gas_reserves(String natural_gas_reserves) {
        this.natural_gas_reserves = natural_gas_reserves;
    }

    public String getOil_consumption() {
        return oil_consumption;
    }

    public void setOil_consumption(String oil_consumption) {
        this.oil_consumption = oil_consumption;
    }

    public String getOil_export() {
        return oil_export;
    }

    public void setOil_export(String oil_export) {
        this.oil_export = oil_export;
    }

    public String getOil_import() {
        return oil_import;
    }

    public void setOil_import(String oil_import) {
        this.oil_import = oil_import;
    }

    public String getOil_production() {
        return oil_production;
    }

    public void setOil_production(String oil_production) {
        this.oil_production = oil_production;
    }

    public String getOil_reserves() {
        return oil_reserves;
    }

    public void setOil_reserves(String oil_reserves) {
        this.oil_reserves = oil_reserves;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getPublic_debt_of_GDP() {
        return public_debt_of_GDP;
    }

    public void setPublic_debt_of_GDP(String public_debt_of_GDP) {
        this.public_debt_of_GDP = public_debt_of_GDP;
    }

    public String getReserves_of_foreign_gold() {
        return reserves_of_foreign_gold;
    }

    public void setReserves_of_foreign_gold(String reserves_of_foreign_gold) {
        this.reserves_of_foreign_gold = reserves_of_foreign_gold;
    }

    public String getTelephones_main_lines() {
        return telephones_main_lines;
    }

    public void setTelephones_main_lines(String telephones_main_lines) {
        this.telephones_main_lines = telephones_main_lines;
    }

    public String getTelephones_mobile_cellular() {
        return telephones_mobile_cellular;
    }

    public void setTelephones_mobile_cellular(String telephones_mobile_cellular) {
        this.telephones_mobile_cellular = telephones_mobile_cellular;
    }

    public String getTotal_fertility_rate() {
        return total_fertility_rate;
    }

    public void setTotal_fertility_rate(String total_fertility_rate) {
        this.total_fertility_rate = total_fertility_rate;
    }

    public String getUnemployment_rate() {
        return unemployment_rate;
    }

    public void setUnemployment_rate(String unemployment_rate) {
        this.unemployment_rate = unemployment_rate;
    }
}
