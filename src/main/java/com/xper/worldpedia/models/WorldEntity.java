package com.xper.worldpedia.models;

import javax.persistence.*;

@Entity
@Table(name = "world")
public class WorldEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String country;

    private double area;

    // healthcare
    private double birth_rate;
    private double death_rate;
    private double infant_mortality;
    private double HIV_AIDS_adult;
    private double HIV_AIDS_deaths;
    private double HIV_AIDS_living;
    private double total_fertility_rate;

    // welfare
    private double life_expectancy;
    private double internet_hosts;
    private double internet_users;
    private double highways;
    private double railways;
    private double labor_force;
    private double population;
    private double telephones_main_lines;
    private double telephones_mobile_cellular;
    private double unemployment_rate;

    // economics
    private double current_account;
    private double debt_external;
    private double exports;
    private double imports;
    private double GDP;
    private double GDP_per_capita;
    private double GDP_real_growth_rate;
    private double public_debt_of_GDP;
    private double reserves_of_foreign_gold;
    private double industrial_production;
    private double inflation_rate;
    private double investment_oss_fixed;

    // resource
    private double military_expenditures_dollar;
    private double military_expenditures_percent;
    private double electricity_consumption;
    private double electricity_production;
    private double natural_gas_consumption;
    private double natural_gas_exports;
    private double natural_gas_imports;
    private double natural_gas_production;
    private double natural_gas_reserves;
    private double oil_consumption;
    private double oil_export;
    private double oil_import;
    private double oil_production;
    private double oil_reserves;


    public WorldEntity(String country, double area, double birth_rate, double death_rate, double current_account, double debt_external, double electricity_consumption, double electricity_production, double exports, double GDP, double GDP_per_capita, double GDP_real_growth_rate, double HIV_AIDS_adult, double HIV_AIDS_deaths, double HIV_AIDS_living, double highways, double railways, double imports, double industrial_production, double infant_mortality, double inflation_rate, double internet_hosts, double internet_users, double investment_oss_fixed, double labor_force, double life_expectancy, double military_expenditures_dollar, double military_expenditures_percent, double natural_gas_consumption, double natural_gas_exports, double natural_gas_imports, double natural_gas_production, double natural_gas_reserves, double oil_consumption, double oil_export, double oil_import, double oil_production, double oil_reserves, double population, double public_debt_of_GDP, double reserves_of_foreign_gold, double telephones_main_lines, double telephones_mobile_cellular, double total_fertility_rate, double unemployment_rate) {
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

    public WorldEntity() {
    }

    public WorldEntity(String country) {
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getBirth_rate() {
        return birth_rate;
    }

    public void setBirth_rate(double birth_rate) {
        this.birth_rate = birth_rate;
    }

    public double getDeath_rate() {
        return death_rate;
    }

    public void setDeath_rate(double death_rate) {
        this.death_rate = death_rate;
    }

    public double getCurrent_account() {
        return current_account;
    }

    public void setCurrent_account(double current_account) {
        this.current_account = current_account;
    }

    public double getDebt_external() {
        return debt_external;
    }

    public void setDebt_external(double debt_external) {
        this.debt_external = debt_external;
    }

    public double getElectricity_consumption() {
        return electricity_consumption;
    }

    public void setElectricity_consumption(double electricity_consumption) {
        this.electricity_consumption = electricity_consumption;
    }

    public double getElectricity_production() {
        return electricity_production;
    }

    public void setElectricity_production(double electricity_production) {
        this.electricity_production = electricity_production;
    }

    public double getExports() {
        return exports;
    }

    public void setExports(double exports) {
        this.exports = exports;
    }

    public double getGDP() {
        return GDP;
    }

    public void setGDP(double GDP) {
        this.GDP = GDP;
    }

    public double getGDP_per_capita() {
        return GDP_per_capita;
    }

    public void setGDP_per_capita(double GDP_per_capita) {
        this.GDP_per_capita = GDP_per_capita;
    }

    public double getGDP_real_growth_rate() {
        return GDP_real_growth_rate;
    }

    public void setGDP_real_growth_rate(double GDP_real_growth_rate) {
        this.GDP_real_growth_rate = GDP_real_growth_rate;
    }

    public double getHIV_AIDS_adult() {
        return HIV_AIDS_adult;
    }

    public void setHIV_AIDS_adult(double HIV_AIDS_adult) {
        this.HIV_AIDS_adult = HIV_AIDS_adult;
    }

    public double getHIV_AIDS_deaths() {
        return HIV_AIDS_deaths;
    }

    public void setHIV_AIDS_deaths(double HIV_AIDS_deaths) {
        this.HIV_AIDS_deaths = HIV_AIDS_deaths;
    }

    public double getHIV_AIDS_living() {
        return HIV_AIDS_living;
    }

    public void setHIV_AIDS_living(double HIV_AIDS_living) {
        this.HIV_AIDS_living = HIV_AIDS_living;
    }

    public double getHighways() {
        return highways;
    }

    public void setHighways(double highways) {
        this.highways = highways;
    }

    public double getRailways() {
        return railways;
    }

    public void setRailways(double railways) {
        this.railways = railways;
    }

    public double getImports() {
        return imports;
    }

    public void setImports(double imports) {
        this.imports = imports;
    }

    public double getIndustrial_production() {
        return industrial_production;
    }

    public void setIndustrial_production(double industrial_production) {
        this.industrial_production = industrial_production;
    }

    public double getInfant_mortality() {
        return infant_mortality;
    }

    public void setInfant_mortality(double infant_mortality) {
        this.infant_mortality = infant_mortality;
    }

    public double getInflation_rate() {
        return inflation_rate;
    }

    public void setInflation_rate(double inflation_rate) {
        this.inflation_rate = inflation_rate;
    }

    public double getInternet_hosts() {
        return internet_hosts;
    }

    public void setInternet_hosts(double internet_hosts) {
        this.internet_hosts = internet_hosts;
    }

    public double getInternet_users() {
        return internet_users;
    }

    public void setInternet_users(double internet_users) {
        this.internet_users = internet_users;
    }

    public double getInvestment_oss_fixed() {
        return investment_oss_fixed;
    }

    public void setInvestment_oss_fixed(double investment_oss_fixed) {
        this.investment_oss_fixed = investment_oss_fixed;
    }

    public double getLabor_force() {
        return labor_force;
    }

    public void setLabor_force(double labor_force) {
        this.labor_force = labor_force;
    }

    public double getLife_expectancy() {
        return life_expectancy;
    }

    public void setLife_expectancy(double life_expectancy) {
        this.life_expectancy = life_expectancy;
    }

    public double getMilitary_expenditures_dollar() {
        return military_expenditures_dollar;
    }

    public void setMilitary_expenditures_dollar(double military_expenditures_dollar) {
        this.military_expenditures_dollar = military_expenditures_dollar;
    }

    public double getMilitary_expenditures_percent() {
        return military_expenditures_percent;
    }

    public void setMilitary_expenditures_percent(double military_expenditures_percent) {
        this.military_expenditures_percent = military_expenditures_percent;
    }

    public double getNatural_gas_consumption() {
        return natural_gas_consumption;
    }

    public void setNatural_gas_consumption(double natural_gas_consumption) {
        this.natural_gas_consumption = natural_gas_consumption;
    }

    public double getNatural_gas_exports() {
        return natural_gas_exports;
    }

    public void setNatural_gas_exports(double natural_gas_exports) {
        this.natural_gas_exports = natural_gas_exports;
    }

    public double getNatural_gas_imports() {
        return natural_gas_imports;
    }

    public void setNatural_gas_imports(double natural_gas_imports) {
        this.natural_gas_imports = natural_gas_imports;
    }

    public double getNatural_gas_production() {
        return natural_gas_production;
    }

    public void setNatural_gas_production(double natural_gas_production) {
        this.natural_gas_production = natural_gas_production;
    }

    public double getNatural_gas_reserves() {
        return natural_gas_reserves;
    }

    public void setNatural_gas_reserves(double natural_gas_reserves) {
        this.natural_gas_reserves = natural_gas_reserves;
    }

    public double getOil_consumption() {
        return oil_consumption;
    }

    public void setOil_consumption(double oil_consumption) {
        this.oil_consumption = oil_consumption;
    }

    public double getOil_export() {
        return oil_export;
    }

    public void setOil_export(double oil_export) {
        this.oil_export = oil_export;
    }

    public double getOil_import() {
        return oil_import;
    }

    public void setOil_import(double oil_import) {
        this.oil_import = oil_import;
    }

    public double getOil_production() {
        return oil_production;
    }

    public void setOil_production(double oil_production) {
        this.oil_production = oil_production;
    }

    public double getOil_reserves() {
        return oil_reserves;
    }

    public void setOil_reserves(double oil_reserves) {
        this.oil_reserves = oil_reserves;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getPublic_debt_of_GDP() {
        return public_debt_of_GDP;
    }

    public void setPublic_debt_of_GDP(double public_debt_of_GDP) {
        this.public_debt_of_GDP = public_debt_of_GDP;
    }

    public double getReserves_of_foreign_gold() {
        return reserves_of_foreign_gold;
    }

    public void setReserves_of_foreign_gold(double reserves_of_foreign_gold) {
        this.reserves_of_foreign_gold = reserves_of_foreign_gold;
    }

    public double getTelephones_main_lines() {
        return telephones_main_lines;
    }

    public void setTelephones_main_lines(double telephones_main_lines) {
        this.telephones_main_lines = telephones_main_lines;
    }

    public double getTelephones_mobile_cellular() {
        return telephones_mobile_cellular;
    }

    public void setTelephones_mobile_cellular(double telephones_mobile_cellular) {
        this.telephones_mobile_cellular = telephones_mobile_cellular;
    }

    public double getTotal_fertility_rate() {
        return total_fertility_rate;
    }

    public void setTotal_fertility_rate(double total_fertility_rate) {
        this.total_fertility_rate = total_fertility_rate;
    }

    public double getUnemployment_rate() {
        return unemployment_rate;
    }

    public void setUnemployment_rate(double unemployment_rate) {
        this.unemployment_rate = unemployment_rate;
    }
}

