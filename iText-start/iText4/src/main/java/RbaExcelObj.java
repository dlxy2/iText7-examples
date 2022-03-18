public class RbaExcelObj {

    public static final String VALUE_YES = "Yes";
    public static final String VALUE_NO = "No";

    // Applicant Type values
    public static final String APPLICANT_TYPE_1 = "Exempted Customers - Comply with regulation 5 of the Anti-Money Laundering Regulations (/\"AMLRs/\") of the Cayman Islands";
    public static final String APPLICANT_TYPE_2 = "Exempted Customers - Regulated Entity";
    public static final String APPLICANT_TYPE_3 = "Exempted Customers - Listed Entity";
    public static final String APPLICANT_TYPE_4 = "Exempted Customers - Central or local government organization, statutory body or agency of government";
    public static final String APPLICANT_TYPE_5 = "Exempted Customers - Pension fund for a professional association or trade union or acting on behalf employees ofan etity of the categories Exempted Customers";
    public static final String APPLICANT_TYPE_6 = "Third Party - Nominee or Agent for a /\"principal/\"";
    public static final String APPLICANT_TYPE_7 = "Third Party - Eligible Introducer";
    public static final String APPLICANT_TYPE_8 = "Individual Customers";
    public static final String APPLICANT_TYPE_9 = "Corporate Customers";
    public static final String APPLICANT_TYPE_10 = "Partnership/Unincoporated Business Customers";
    public static final String APPLICANT_TYPE_11 = "Trust, NPO and Other Customers (e.g. family trusts, charities, foundations, etc)";

    // Engaged in specific businesses/activities
    public static final String ENGAGED_IN_SPECIFIC_BUSINESSES_1="Arms, defense, military, atomic power, marijuana;";
    public static final String ENGAGED_IN_SPECIFIC_BUSINESSES_2="Extractive industries, precious metals and stones, virtual currencies";
    public static final String ENGAGED_IN_SPECIFIC_BUSINESSES_3="Money or value transfer, payment service, gambling;";
    public static final String ENGAGED_IN_SPECIFIC_BUSINESSES_4="Regulated charities, non-government organisation";
    public static final String ENGAGED_IN_SPECIFIC_BUSINESSES_5="Unregulated charities, embassy/consulate";
    public static final String ENGAGED_IN_SPECIFIC_BUSINESSES_6="Adult entertainment, shell bank";
    public static final String ENGAGED_IN_SPECIFIC_BUSINESSES_7="None of the above";

    // Applicant Type
    public String applicantType = null;
    // Politically Exposed Persons Declaration
    public String politicallyExposedPersonsDeclaration = null;
    // Criminal/civil/regulatory proceedings for crime, corruption, misuse of public funds
    public String criminalCivilRegulatory = null;
    // Investing on behalf of and in the interest of myself/ourselves
    public String investingOnBehalf = null;
    // Source of Fund
    public String sourceOfFund = null;
    // Employment Status
    public String employmentStatus = null;
    // Job Nature
    public String jobNature = null;
    // Job Level
    public String jobLevel = null;
    // Name of Employer/Business
    public String nameOfEmployer = null;
    // Employment Start Date (MM/YYYY)
    public String employmentStartDate = null;
    // Business Industry
    public String businessIndustry = null;
    // Engaged in specific businesses/activities
    public String engagedInSpecificBusinesses = null;


    /**
     * init rba fields
     */
    public void initRbaField() {
        applicantType = null;
        politicallyExposedPersonsDeclaration = null;
        criminalCivilRegulatory = null;
        investingOnBehalf = null;
        sourceOfFund = null;
        employmentStatus = null;
        jobNature = null;
        jobLevel = null;
        nameOfEmployer = null;
        employmentStartDate = null;
        businessIndustry = null;
        engagedInSpecificBusinesses = null;
    }

    public void resetFieldsValue(CQFormField cqFormField){
        setApplicantTypeValue(cqFormField);
        setPoliticallyExposedValue(cqFormField);
        setCriminalCivilRegulatoryValue(cqFormField);
        setInvestingOnBehalfValue(cqFormField);
        setSourceOfFundValue(cqFormField);
        setEmploymentStatusValue(cqFormField);
        setJobNatureValue(cqFormField);
        setJobLevelValue(cqFormField);
        setNameOfEmployerValue(cqFormField);
        setEmploymentStartDateValue(cqFormField);
        setBusinessIndustryValue(cqFormField);
        setEngagedInSpecificBusinessesValue(cqFormField);
    }

    public void formatFieldsValue(){
        applicantType = (applicantType!=null?applicantType:"");
        politicallyExposedPersonsDeclaration = (politicallyExposedPersonsDeclaration!=null?politicallyExposedPersonsDeclaration:"");
        criminalCivilRegulatory = (criminalCivilRegulatory!=null?criminalCivilRegulatory:"");
        investingOnBehalf =(investingOnBehalf!=null?investingOnBehalf:"");
        sourceOfFund = (sourceOfFund!=null?sourceOfFund:"");
        employmentStatus = (employmentStatus!=null?employmentStatus:"");
        jobNature = (jobNature!=null?jobNature:"");
        jobLevel = (jobLevel!=null?jobLevel:"");
        nameOfEmployer = (nameOfEmployer!=null?nameOfEmployer:"");
        employmentStartDate =  (employmentStartDate!=null?employmentStartDate:"");
        businessIndustry =  (businessIndustry!=null?businessIndustry:"");
        engagedInSpecificBusinesses = (engagedInSpecificBusinesses!=null?engagedInSpecificBusinesses:"");
    }

    public void writeLogs(){
        System.out.println("【excel applicantType is】" + applicantType);
        System.out.println("【excel Politically Exposed Persons Declaration is】" + politicallyExposedPersonsDeclaration);
        System.out.println("【excel Criminal/civil/regulatory proceedings is】" + criminalCivilRegulatory);
        System.out.println("【excel Investing on behalf is】" + investingOnBehalf);
        System.out.println("【excel Source of Fund is】" + sourceOfFund);
        System.out.println("【excel Employment Status is】" + employmentStatus);
        System.out.println("【excel Job Nature is】" + jobNature);
        System.out.println("【excel Job Level is】" + jobLevel);
        System.out.println("【excel Name of Employer/Business is】" + nameOfEmployer);
        System.out.println("【excel Employment Start Date is】" + employmentStartDate);
        System.out.println("【excel Business Industry is】" + businessIndustry);
        System.out.println("【excel  Engaged in specific businesses/activities is】" + engagedInSpecificBusinesses);
    }

    /***
     * set Applicant Type value
     * @param cqFormField
     */
    public void setApplicantTypeValue(CQFormField cqFormField) {
        // Q1 =Reg 5 Cayman  &&  Q2 =Exempted customer
        if (CQFormField.APPLICANT_TYPE_Q1_1_VALUE.equals(cqFormField.applicantTypeQ1)
                && CQFormField.APPLICANT_TYPE_Q2_1_VALUE.equals(cqFormField.applicantTypeQ2)) {
            applicantType = APPLICANT_TYPE_1;
        }
        // Q1 =Regulated Entity  &&  Q2 =Exempted customer
        if (CQFormField.APPLICANT_TYPE_Q1_2_VALUE.equals(cqFormField.applicantTypeQ1)
                && CQFormField.APPLICANT_TYPE_Q2_1_VALUE.equals(cqFormField.applicantTypeQ2)) {
            applicantType = APPLICANT_TYPE_2;
        }
        // Q1 =Listed Entity  &&  Q2 =Exempted customer
        if (CQFormField.APPLICANT_TYPE_Q1_3_VALUE.equals(cqFormField.applicantTypeQ1)
                && CQFormField.APPLICANT_TYPE_Q2_1_VALUE.equals(cqFormField.applicantTypeQ2)) {
            applicantType = APPLICANT_TYPE_3;
        }
        // Q1 =Government  &&  Q2 =Exempted customer
        if (CQFormField.APPLICANT_TYPE_Q1_4_VALUE.equals(cqFormField.applicantTypeQ1)
                && CQFormField.APPLICANT_TYPE_Q2_1_VALUE.equals(cqFormField.applicantTypeQ2)) {
            applicantType = APPLICANT_TYPE_4;
        }
        // Q1 =Pension/Trade Union  &&  Q2 =Exempted customer
        if (CQFormField.APPLICANT_TYPE_Q1_5_VALUE.equals(cqFormField.applicantTypeQ1)
                && CQFormField.APPLICANT_TYPE_Q2_1_VALUE.equals(cqFormField.applicantTypeQ2)) {
            applicantType = APPLICANT_TYPE_5;
        }
        // Q2 =Nomiee/Agent
        if (CQFormField.APPLICANT_TYPE_Q2_2_VALUE.equals(cqFormField.applicantTypeQ2)) {
            applicantType = APPLICANT_TYPE_6;
        }
        // Q2 =Eligible Intoducer
        if (CQFormField.APPLICANT_TYPE_Q2_3_VALUE.equals(cqFormField.applicantTypeQ2)) {
            applicantType = APPLICANT_TYPE_7;
        }
        // Regular Customer Type =Individual
        if (CQFormField.REGULAR_CUSTOMER_TYPE_1_VALUE.equals(cqFormField.regularCustomerType)) {
            applicantType = APPLICANT_TYPE_8;
        }
        // Regular Customer Type =Corporate
        if (CQFormField.REGULAR_CUSTOMER_TYPE_2_VALUE.equals(cqFormField.regularCustomerType)) {
            applicantType = APPLICANT_TYPE_9;
        }
        // Regular Customer Type =Partnership/Unincorporated
        if (CQFormField.REGULAR_CUSTOMER_TYPE_3_VALUE.equals(cqFormField.regularCustomerType)) {
            applicantType = APPLICANT_TYPE_10;
        }
        // Regular Customer Type =Trust, NPO & Other
        if (CQFormField.REGULAR_CUSTOMER_TYPE_4_VALUE.equals(cqFormField.regularCustomerType)) {
            applicantType = APPLICANT_TYPE_11;
        }
    }

    /**
     * set politicallyExposedPersonsDeclaration value
     *
     * @param cqFormField
     */
    public void setPoliticallyExposedValue(CQFormField cqFormField) {
        if (CQFormField.PEP_1_VALUE.equals(cqFormField.pep)) {
            politicallyExposedPersonsDeclaration = VALUE_YES;
        }
        if (CQFormField.PEP_2_VALUE.equals(cqFormField.pep)) {
            politicallyExposedPersonsDeclaration = VALUE_NO;
        }
    }

    /**
     * set criminalCivilRegulatory value
     * @param cqFormField
     */
    public void setCriminalCivilRegulatoryValue(CQFormField cqFormField) {
        if (CQFormField.ETHICAL_1_VALUE.equals(cqFormField.ethical)) {
            criminalCivilRegulatory = VALUE_YES;
        }
        if (CQFormField.ETHICAL_2_VALUE.equals(cqFormField.ethical)) {
            criminalCivilRegulatory = VALUE_NO;
        }
    }

    /**
     * set investingOnBehalf value
     * @param cqFormField
     */
    public void setInvestingOnBehalfValue(CQFormField cqFormField){
        //Source of Funds Choice=Individual
        if (CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            investingOnBehalf = VALUE_YES;
        }
        // Investment Choice=On behalf of itself && Source of Funds Choice=Corporate and other legal form
        if (CQFormField.INVESTMENT_CHOICE_1_VALUE.equals(cqFormField.investmentChoice)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_1_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            investingOnBehalf = VALUE_YES;
        }
        // Investment Choice=On behalf of its customer && Source of Funds Choice=Corporate and other legal form
        if (CQFormField.INVESTMENT_CHOICE_2_VALUE.equals(cqFormField.investmentChoice)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_1_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            investingOnBehalf = VALUE_NO;
        }
    }

    /**
     * set sourceOfFund value
     * @param cqFormField
     */
    public void setSourceOfFundValue(CQFormField cqFormField){
        // Source of Funds - Individual=Income, Revenue and Business Activities && Source of Funds Choice=Individual
        if (CQFormField.SOURCE_OF_FUNDS_INDIVIDUAL_1_VALUE.equals(cqFormField.sourceOfFundsIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            sourceOfFund = CQFormField.SOURCE_OF_FUNDS_INDIVIDUAL_1_VALUE;
        }
        // Source of Funds - Investment Activities  && Source of Funds Choice=Individual
        if (CQFormField.SOURCE_OF_FUNDS_INDIVIDUAL_2_VALUE.equals(cqFormField.sourceOfFundsIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            sourceOfFund = CQFormField.SOURCE_OF_FUNDS_INDIVIDUAL_2_VALUE;
        }
        // Source of Funds =Family/Generational Wealth and Personal Backgrouds && Source of Funds Choice=Individual
        if (CQFormField.SOURCE_OF_FUNDS_INDIVIDUAL_3_VALUE.equals(cqFormField.sourceOfFundsIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            sourceOfFund = CQFormField.SOURCE_OF_FUNDS_INDIVIDUAL_3_VALUE;
        }
    }

    /**
     * set employmentStatus value
     * @param cqFormField
     */
    public void setEmploymentStatusValue(CQFormField cqFormField){
        // Employment Status - Individual=Not currently employed  && Source of Funds Choice=Individual
        if (CQFormField.EMPLOYMENT_STATUS_INDIVIDUAL_1_VALUE.equals(cqFormField.employmentStatusIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            employmentStatus = CQFormField.EMPLOYMENT_STATUS_INDIVIDUAL_1_VALUE;
        }
        // Employment Status - Individual=Fulltime employed  && Source of Funds Choice=Individual
        if (CQFormField.EMPLOYMENT_STATUS_INDIVIDUAL_2_VALUE.equals(cqFormField.employmentStatusIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            employmentStatus = CQFormField.EMPLOYMENT_STATUS_INDIVIDUAL_2_VALUE;
        }
        // Employment Status - Individual=Parttime employed  && Source of Funds Choice=Individual
        if (CQFormField.EMPLOYMENT_STATUS_INDIVIDUAL_3_VALUE.equals(cqFormField.employmentStatusIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            employmentStatus = CQFormField.EMPLOYMENT_STATUS_INDIVIDUAL_3_VALUE;
        }
        // Employment Status - Individual=Self-employed  && Source of Funds Choice=Individual
        if (CQFormField.EMPLOYMENT_STATUS_INDIVIDUAL_4_VALUE.equals(cqFormField.employmentStatusIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            employmentStatus = CQFormField.EMPLOYMENT_STATUS_INDIVIDUAL_4_VALUE;
        }
        // Employment Status - Individual=Student  && Source of Funds Choice=Individual
        if (CQFormField.EMPLOYMENT_STATUS_INDIVIDUAL_5_VALUE.equals(cqFormField.employmentStatusIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            employmentStatus = CQFormField.EMPLOYMENT_STATUS_INDIVIDUAL_5_VALUE;
        }
        // Employment Status - Individual=HouseWife  && Source of Funds Choice=Individual
        if (CQFormField.EMPLOYMENT_STATUS_INDIVIDUAL_6_VALUE.equals(cqFormField.employmentStatusIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            employmentStatus = CQFormField.EMPLOYMENT_STATUS_INDIVIDUAL_6_VALUE;
        }
        // Employment Status - Individual=Retired  && Source of Funds Choice=Individual
        if (CQFormField.EMPLOYMENT_STATUS_INDIVIDUAL_7_VALUE.equals(cqFormField.employmentStatusIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            employmentStatus = CQFormField.EMPLOYMENT_STATUS_INDIVIDUAL_7_VALUE;
        }
    }


    /**
     * set jobNature value
     * @param cqFormField
     */
    public void setJobNatureValue(CQFormField cqFormField){
        // Job Nature - Individual=Agriculture  && Source of Funds Choice=Individual
        if (CQFormField.JOB_NATURE_INDIVIDUAL_1_VALUE.equals(cqFormField.jobNatureIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            jobNature = CQFormField.JOB_NATURE_INDIVIDUAL_1_VALUE;
        }
        if (CQFormField.JOB_NATURE_INDIVIDUAL_2_VALUE.equals(cqFormField.jobNatureIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            jobNature = CQFormField.JOB_NATURE_INDIVIDUAL_2_VALUE;
        }
        if (CQFormField.JOB_NATURE_INDIVIDUAL_3_VALUE.equals(cqFormField.jobNatureIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            jobNature = CQFormField.JOB_NATURE_INDIVIDUAL_3_VALUE;
        }
        if (CQFormField.JOB_NATURE_INDIVIDUAL_4_VALUE.equals(cqFormField.jobNatureIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            jobNature = CQFormField.JOB_NATURE_INDIVIDUAL_4_VALUE;
        }
        if (CQFormField.JOB_NATURE_INDIVIDUAL_5_VALUE.equals(cqFormField.jobNatureIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            jobNature = CQFormField.JOB_NATURE_INDIVIDUAL_5_VALUE;
        }
        if (CQFormField.JOB_NATURE_INDIVIDUAL_6_VALUE.equals(cqFormField.jobNatureIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            jobNature = CQFormField.JOB_NATURE_INDIVIDUAL_6_VALUE;
        }
        if (CQFormField.JOB_NATURE_INDIVIDUAL_7_VALUE.equals(cqFormField.jobNatureIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            jobNature = CQFormField.JOB_NATURE_INDIVIDUAL_7_VALUE;
        }
        if (CQFormField.JOB_NATURE_INDIVIDUAL_8_VALUE.equals(cqFormField.jobNatureIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            jobNature = CQFormField.JOB_NATURE_INDIVIDUAL_8_VALUE;
        }
        if (CQFormField.JOB_NATURE_INDIVIDUAL_9_VALUE.equals(cqFormField.jobNatureIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            jobNature = CQFormField.JOB_NATURE_INDIVIDUAL_9_VALUE;
        }
        if (CQFormField.JOB_NATURE_INDIVIDUAL_10_VALUE.equals(cqFormField.jobNatureIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            jobNature = CQFormField.JOB_NATURE_INDIVIDUAL_10_VALUE;
        }
        if (CQFormField.JOB_NATURE_INDIVIDUAL_11_VALUE.equals(cqFormField.jobNatureIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            jobNature = CQFormField.JOB_NATURE_INDIVIDUAL_11_VALUE;
        }
        if (CQFormField.JOB_NATURE_INDIVIDUAL_12_VALUE.equals(cqFormField.jobNatureIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            jobNature = CQFormField.JOB_NATURE_INDIVIDUAL_12_VALUE;
        }
        if (CQFormField.JOB_NATURE_INDIVIDUAL_13_VALUE.equals(cqFormField.jobNatureIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            jobNature = CQFormField.JOB_NATURE_INDIVIDUAL_13_VALUE;
        }
        if (CQFormField.JOB_NATURE_INDIVIDUAL_14_VALUE.equals(cqFormField.jobNatureIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            jobNature = CQFormField.JOB_NATURE_INDIVIDUAL_14_VALUE;
        }
        if (CQFormField.JOB_NATURE_INDIVIDUAL_15_VALUE.equals(cqFormField.jobNatureIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            jobNature = CQFormField.JOB_NATURE_INDIVIDUAL_15_VALUE;
        }
        if (CQFormField.JOB_NATURE_INDIVIDUAL_16_VALUE.equals(cqFormField.jobNatureIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            jobNature = CQFormField.JOB_NATURE_INDIVIDUAL_16_VALUE;
        }
        if (CQFormField.JOB_NATURE_INDIVIDUAL_17_VALUE.equals(cqFormField.jobNatureIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            jobNature = CQFormField.JOB_NATURE_INDIVIDUAL_17_VALUE;
        }
        if (CQFormField.JOB_NATURE_INDIVIDUAL_18_VALUE.equals(cqFormField.jobNatureIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            jobNature = CQFormField.JOB_NATURE_INDIVIDUAL_18_VALUE;
        }
        if (CQFormField.JOB_NATURE_INDIVIDUAL_19_VALUE.equals(cqFormField.jobNatureIndividual)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            jobNature = CQFormField.JOB_NATURE_INDIVIDUAL_19_VALUE;
        }
    }


    /**
     * set jobLevel value
     * @param cqFormField
     */
    public void setJobLevelValue(CQFormField cqFormField) {
        // Job Level  && Source of Funds Choice=Individual
        if (CQFormField.JOB_LEVEL_1_VALUE.equals(cqFormField.jobLevel)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            jobLevel = CQFormField.JOB_LEVEL_1_VALUE;
        }
        if (CQFormField.JOB_LEVEL_2_VALUE.equals(cqFormField.jobLevel)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            jobLevel = CQFormField.JOB_LEVEL_2_VALUE;
        }
        if (CQFormField.JOB_LEVEL_3_VALUE.equals(cqFormField.jobLevel)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            jobLevel = CQFormField.JOB_LEVEL_3_VALUE;
        }
        if (CQFormField.JOB_LEVEL_4_VALUE.equals(cqFormField.jobLevel)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            jobLevel = CQFormField.JOB_LEVEL_4_VALUE;
        }
        if (CQFormField.JOB_LEVEL_5_VALUE.equals(cqFormField.jobLevel)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            jobLevel = CQFormField.JOB_LEVEL_5_VALUE;
        }
    }

    /**
     * set nameOfEmployer value
     * @param cqFormField
     */
    public void setNameOfEmployerValue(CQFormField cqFormField) {
        // Name of EmployerBusiness  && Source of Funds Choice=Individual
        if (CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            nameOfEmployer = cqFormField.nameOfEmployerBusinessIndividual;
        }
    }

    /**
     * set employmentStartDate value
     * @param cqFormField
     */
    public void setEmploymentStartDateValue(CQFormField cqFormField) {
        // employmentStartDate  && Source of Funds Choice=Individual
        if (CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            employmentStartDate = cqFormField.employmentStartDate;
        }
    }


    /**
     * set businessIndustry value
     * @param cqFormField
     */
    public void setBusinessIndustryValue(CQFormField cqFormField) {
        // businessIndustry  && Source of Funds Choice=Corporate and other legal form
        if (CQFormField.BUSINESS_INDUSTRY_1_VALUE.equals(cqFormField.businessIndustry)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_1_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            businessIndustry = CQFormField.BUSINESS_INDUSTRY_1_VALUE;
        }
        if (CQFormField.BUSINESS_INDUSTRY_2_VALUE.equals(cqFormField.businessIndustry)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_1_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            businessIndustry = CQFormField.BUSINESS_INDUSTRY_2_VALUE;
        }
        if (CQFormField.BUSINESS_INDUSTRY_3_VALUE.equals(cqFormField.businessIndustry)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_1_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            businessIndustry = CQFormField.BUSINESS_INDUSTRY_3_VALUE;
        }
        if (CQFormField.BUSINESS_INDUSTRY_4_VALUE.equals(cqFormField.businessIndustry)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_1_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            businessIndustry = CQFormField.BUSINESS_INDUSTRY_4_VALUE;
        }
        if (CQFormField.BUSINESS_INDUSTRY_5_VALUE.equals(cqFormField.businessIndustry)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_1_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            businessIndustry = CQFormField.BUSINESS_INDUSTRY_5_VALUE;
        }
        if (CQFormField.BUSINESS_INDUSTRY_6_VALUE.equals(cqFormField.businessIndustry)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_1_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            businessIndustry = CQFormField.BUSINESS_INDUSTRY_6_VALUE;
        }
        if (CQFormField.BUSINESS_INDUSTRY_7_VALUE.equals(cqFormField.businessIndustry)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_1_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            businessIndustry = CQFormField.BUSINESS_INDUSTRY_7_VALUE;
        }
        if (CQFormField.BUSINESS_INDUSTRY_8_VALUE.equals(cqFormField.businessIndustry)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_1_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            businessIndustry = CQFormField.BUSINESS_INDUSTRY_8_VALUE;
        }
        if (CQFormField.BUSINESS_INDUSTRY_9_VALUE.equals(cqFormField.businessIndustry)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_1_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            businessIndustry = CQFormField.BUSINESS_INDUSTRY_9_VALUE;
        }
        if (CQFormField.BUSINESS_INDUSTRY_10_VALUE.equals(cqFormField.businessIndustry)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_1_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            businessIndustry = CQFormField.BUSINESS_INDUSTRY_10_VALUE;
        }
        if (CQFormField.BUSINESS_INDUSTRY_11_VALUE.equals(cqFormField.businessIndustry)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_1_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            businessIndustry = CQFormField.BUSINESS_INDUSTRY_11_VALUE;
        }
    }

    /**
     * set engagedInSpecificBusinesses value
     * @param cqFormField
     */
    public void setEngagedInSpecificBusinessesValue(CQFormField cqFormField) {
        // engagedInSpecificBusinesses  && Source of Funds Choice=Corporate and other legal form
        if (CQFormField.PART_52C_YES_1.equals(cqFormField.part52cYes1)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_1_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            engagedInSpecificBusinesses = ENGAGED_IN_SPECIFIC_BUSINESSES_1;
        }
        if (CQFormField.PART_52C_YES_2.equals(cqFormField.part52cYes2)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_1_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            engagedInSpecificBusinesses = ENGAGED_IN_SPECIFIC_BUSINESSES_2;
        }
        if (CQFormField.PART_52C_YES_3.equals(cqFormField.part52cYes3)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_1_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            engagedInSpecificBusinesses = ENGAGED_IN_SPECIFIC_BUSINESSES_3;
        }
        if (CQFormField.PART_52C_YES_4.equals(cqFormField.part52cYes4)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_1_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            engagedInSpecificBusinesses = ENGAGED_IN_SPECIFIC_BUSINESSES_4;
        }
        if (CQFormField.PART_52C_YES_5.equals(cqFormField.part52cYes5)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_1_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            engagedInSpecificBusinesses = ENGAGED_IN_SPECIFIC_BUSINESSES_5;
        }
        if (CQFormField.PART_52C_YES_6.equals(cqFormField.part52cYes6)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_1_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            engagedInSpecificBusinesses = ENGAGED_IN_SPECIFIC_BUSINESSES_6;
        }
        if (CQFormField.PART_52C_YES_7.equals(cqFormField.part52cYes7)
                && CQFormField.SOURCE_OF_FUNDS_CHOICE_1_VALUE.equals(cqFormField.sourceOfFundsChoice)) {
            engagedInSpecificBusinesses = ENGAGED_IN_SPECIFIC_BUSINESSES_7;
        }
    }
}
