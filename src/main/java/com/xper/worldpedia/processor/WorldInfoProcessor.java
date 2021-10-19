package com.xper.worldpedia.processor;

import com.xper.worldpedia.models.WorldEntity;
import com.xper.worldpedia.models.WorldModelInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;


public class WorldInfoProcessor implements ItemProcessor<WorldModelInput, WorldEntity> {

    public double stringToDouble(String value) {

        if (value.isEmpty() || value.isBlank()) {
            return 0;
        }
        return Double.parseDouble(value);
    }

    private static final Logger log = LoggerFactory.getLogger(WorldInfoProcessor.class);


    @Override
    public WorldEntity process(final WorldModelInput c) throws Exception {

        WorldEntity w = new WorldEntity();

        try {
            w.setCountry(c.getCountry());
            w.setArea(stringToDouble(c.getArea()));
            w.setBirth_rate(stringToDouble(c.getBirth_rate()));
            w.setDeath_rate(stringToDouble(c.getDeath_rate()));
            w.setCurrent_account(stringToDouble(c.getCurrent_account()));
            w.setDebt_external(stringToDouble(c.getDebt_external()));
            w.setElectricity_consumption(stringToDouble(c.getElectricity_consumption()));
            w.setElectricity_production(stringToDouble(c.getElectricity_production()));
            w.setExports(stringToDouble(c.getExports()));
            w.setGDP(stringToDouble(c.getGDP()));
            w.setGDP_per_capita(stringToDouble(c.getGDP_per_capita()));
            w.setGDP_real_growth_rate(stringToDouble(c.getGDP_real_growth_rate()));
            w.setHIV_AIDS_adult(stringToDouble(c.getHIV_AIDS_adult()));
            w.setHIV_AIDS_deaths(stringToDouble(c.getHIV_AIDS_deaths()));
            w.setHIV_AIDS_living(stringToDouble(c.getHIV_AIDS_living()));
            w.setHighways(stringToDouble(c.getHighways()));
            w.setRailways(stringToDouble(c.getRailways()));
            w.setRailways(stringToDouble(c.getRailways()));
            w.setIndustrial_production(stringToDouble(c.getIndustrial_production()));
            w.setInfant_mortality(stringToDouble(c.getInfant_mortality()));
            w.setInflation_rate(stringToDouble(c.getInflation_rate()));
            w.setInternet_hosts(stringToDouble(c.getInternet_hosts()));
            w.setInternet_users(stringToDouble(c.getInternet_users()));
            w.setInvestment_oss_fixed(stringToDouble(c.getInvestment_oss_fixed()));
            w.setLabor_force(stringToDouble(c.getLabor_force()));
            w.setLife_expectancy(stringToDouble(c.getLife_expectancy()));
            w.setMilitary_expenditures_dollar(stringToDouble(c.getMilitary_expenditures_dollar()));
            w.setMilitary_expenditures_percent(stringToDouble(c.getMilitary_expenditures_percent()));
            w.setNatural_gas_consumption(stringToDouble(c.getNatural_gas_consumption()));
            w.setNatural_gas_exports(stringToDouble(c.getNatural_gas_exports()));
            w.setNatural_gas_imports(stringToDouble(c.getNatural_gas_imports()));
            w.setNatural_gas_production(stringToDouble(c.getNatural_gas_production()));
            w.setNatural_gas_reserves(stringToDouble(c.getNatural_gas_reserves()));
            w.setOil_consumption(stringToDouble(c.getOil_consumption()));
            w.setOil_export(stringToDouble(c.getOil_export()));
            w.setOil_import(stringToDouble(c.getOil_import()));
            w.setOil_production(stringToDouble(c.getOil_production()));
            w.setOil_reserves(stringToDouble(c.getOil_reserves()));
            w.setPopulation(stringToDouble(c.getPopulation()));
            w.setPublic_debt_of_GDP(stringToDouble(c.getPublic_debt_of_GDP()));
            w.setReserves_of_foreign_gold(stringToDouble(c.getReserves_of_foreign_gold()));
            w.setTelephones_main_lines(stringToDouble(c.getTelephones_main_lines()));
            w.setTelephones_mobile_cellular(stringToDouble(c.getTelephones_mobile_cellular()));
            w.setTotal_fertility_rate(stringToDouble(c.getTotal_fertility_rate()));
            w.setUnemployment_rate(stringToDouble(c.getUnemployment_rate()));

        } catch (Exception e) {
        }

        return w;

    }
}
