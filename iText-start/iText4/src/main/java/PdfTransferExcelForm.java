/**
 * Created by ASUS on 2017/9/12.
 */

import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfButtonFormField;
import com.itextpdf.forms.fields.PdfFormField;
import com.itextpdf.kernel.pdf.*;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

/**
 * Simple filling out form example.
 */
public class PdfTransferExcelForm {

    public static final String SRC = "src/main/resources/pdf/CustomerQuestionaire.pdf";
    public static final String DEST = "results/chapter04/fill_form.pdf";

    public String pdfPath=null;
    public String excelTempPath=null;
    public String createExcelPath=null;

    public static void main(String args[]) throws IOException {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new PdfTransferExcelForm().manipulatePdf(SRC, DEST);
    }

    public void manipulatePdf(String src, String dest) throws IOException {
        //Initialize PDF document
        PdfDocument pdf = new PdfDocument(new PdfReader(src), new PdfWriter(dest));
        PdfAcroForm form = PdfAcroForm.getAcroForm(pdf, true);
        // read fields values
        Map<String, PdfFormField> fields = form.getFormFields();

        CQFormField cqFormField=new CQFormField();
        //Applicant Type Q1
        if(cqFormField.hasRadioIsCheck(fields,CQFormField.APPLICANT_TYPE_Q1_1)){
            cqFormField.applicantTypeQ1=CQFormField.APPLICANT_TYPE_Q1_1_VALUE;
        }else if(cqFormField.hasRadioIsCheck(fields,CQFormField.APPLICANT_TYPE_Q1_2)){
            cqFormField.applicantTypeQ1=CQFormField.APPLICANT_TYPE_Q1_2_VALUE;
        }else if(cqFormField.hasRadioIsCheck(fields,CQFormField.APPLICANT_TYPE_Q1_3)){
            cqFormField.applicantTypeQ1=CQFormField.APPLICANT_TYPE_Q1_3_VALUE;
        }else if(cqFormField.hasRadioIsCheck(fields,CQFormField.APPLICANT_TYPE_Q1_4)){
            cqFormField.applicantTypeQ1=CQFormField.APPLICANT_TYPE_Q1_4_VALUE;
        }else if(cqFormField.hasRadioIsCheck(fields,CQFormField.APPLICANT_TYPE_Q1_5)){
            cqFormField.applicantTypeQ1=CQFormField.APPLICANT_TYPE_Q1_5_VALUE;
        }

        System.out.println("【Applicant Type Q1】 is "+cqFormField.applicantTypeQ1);

        //Applicant Type Q2
        if(cqFormField.hasRadioIsCheck(fields,CQFormField.APPLICANT_TYPE_Q2_1)){
            cqFormField.applicantTypeQ2=CQFormField.APPLICANT_TYPE_Q2_1_VALUE;
        }else if(cqFormField.hasRadioIsCheck(fields,CQFormField.APPLICANT_TYPE_Q2_2)){
            cqFormField.applicantTypeQ2=CQFormField.APPLICANT_TYPE_Q2_2_VALUE;
        }else if(cqFormField.hasRadioIsCheck(fields,CQFormField.APPLICANT_TYPE_Q2_3)){
            cqFormField.applicantTypeQ2=CQFormField.APPLICANT_TYPE_Q2_3_VALUE;
        }
        System.out.println("【Applicant Type Q2】 is "+cqFormField.applicantTypeQ2);

        //Regular Customer Type
        if(cqFormField.hasRadioIsCheck(fields,CQFormField.REGULAR_CUSTOMER_TYPE_1)){
            cqFormField.regularCustomerType=CQFormField.REGULAR_CUSTOMER_TYPE_1_VALUE;
        }else if(cqFormField.hasRadioIsCheck(fields,CQFormField.REGULAR_CUSTOMER_TYPE_2)){
            cqFormField.regularCustomerType=CQFormField.REGULAR_CUSTOMER_TYPE_2_VALUE;
        }else if(cqFormField.hasRadioIsCheck(fields,CQFormField.REGULAR_CUSTOMER_TYPE_3)){
            cqFormField.regularCustomerType=CQFormField.REGULAR_CUSTOMER_TYPE_3_VALUE;
        }else if(cqFormField.hasRadioIsCheck(fields,CQFormField.REGULAR_CUSTOMER_TYPE_4)){
            cqFormField.regularCustomerType=CQFormField.REGULAR_CUSTOMER_TYPE_4_VALUE;
        }
        System.out.println("【Regular Customer Type】 is "+cqFormField.regularCustomerType);

        //PEP
        if(cqFormField.hasRadioIsCheck(fields,CQFormField.PEP_1)){
            cqFormField.pep=CQFormField.PEP_1_VALUE;
        }else if(cqFormField.hasRadioIsCheck(fields,CQFormField.PEP_2)){
            cqFormField.pep=CQFormField.PEP_2_VALUE;
        }
        System.out.println("【PEP】 is "+cqFormField.pep);

        //Ethical
        if(cqFormField.hasRadioIsCheck(fields,CQFormField.ETHICAL_1)){
            cqFormField.ethical=CQFormField.ETHICAL_1_VALUE;
        }else if(cqFormField.hasRadioIsCheck(fields,CQFormField.ETHICAL_2)){
            cqFormField.ethical=CQFormField.ETHICAL_2_VALUE;
        }
        System.out.println("【Ethical】 is "+cqFormField.ethical);

        //Source of Funds Choice
        if(cqFormField.hasRadioIsCheck(fields,CQFormField.SOURCE_OF_FUNDS_CHOICE_1)){
            cqFormField.sourceOfFundsChoice=CQFormField.SOURCE_OF_FUNDS_CHOICE_1_VALUE;
        }else if(cqFormField.hasRadioIsCheck(fields,CQFormField.SOURCE_OF_FUNDS_CHOICE_2)){
            cqFormField.sourceOfFundsChoice=CQFormField.SOURCE_OF_FUNDS_CHOICE_2_VALUE;
        }
        System.out.println("【Source of Funds Choice】 is "+cqFormField.sourceOfFundsChoice);

        //Investment Choice
        if(cqFormField.hasRadioIsCheck(fields,CQFormField.INVESTMENT_CHOICE_1)){
            cqFormField.investmentChoice=CQFormField.INVESTMENT_CHOICE_1_VALUE;
        }else if(cqFormField.hasRadioIsCheck(fields,CQFormField.INVESTMENT_CHOICE_2)){
            cqFormField.investmentChoice=CQFormField.INVESTMENT_CHOICE_2_VALUE;
        }
        System.out.println("【Investment Choice】 is "+cqFormField.investmentChoice);

        //Source of Funds - Individual
        cqFormField.sourceOfFundsIndividual=cqFormField.getSourceOfFundsIndividualValue(fields,CQFormField.SOURCE_OF_FUNDS_INDIVIDUAL);
        System.out.println("【Source of Funds - Individual】 is "+cqFormField.sourceOfFundsIndividual);

        //Employment Status - Individual
        cqFormField.employmentStatusIndividual=cqFormField.getEmploymentStatusIndividualValue(fields,CQFormField.EMPLOYMENT_STATUS_INDIVIDUAL);
        System.out.println("【Employment Status - Individual】 is "+cqFormField.employmentStatusIndividual);

        //Job Nature - Individual
        cqFormField.jobNatureIndividual=cqFormField.getJobNatureIndividualValue(fields,CQFormField.JOB_NATURE_INDIVIDUAL);
        System.out.println("【Job Nature - Individual】 is "+cqFormField.jobNatureIndividual);

        // Job Level
        cqFormField.jobLevel=cqFormField.getJobLevelValue(fields,CQFormField.JOB_LEVEL);
        System.out.println("【Job Level】 is "+cqFormField.jobLevel);

        // Name of EmployerBusiness - Individual
        cqFormField.nameOfEmployerBusinessIndividual=cqFormField.getFormFieldTextValue(fields,CQFormField.NAME_OF_EBI);
        System.out.println("【Name of EmployerBusiness - Individual】 is "+cqFormField.nameOfEmployerBusinessIndividual);

        // Employment Start Date
        cqFormField.employmentStartDate=cqFormField.getFormFieldTextValue(fields,CQFormField.EMPLOYMENT_START_DATE);
        System.out.println("【Employment Start Date】 is "+cqFormField.employmentStartDate);

        //Business Industry
        cqFormField.businessIndustry=cqFormField.getBusinessIndustryValue(fields,CQFormField.BUSINESS_INDUSTRY);
        System.out.println("【Business Industry】 is "+cqFormField.businessIndustry);

        //Part 5.2.c.(1) Yes
        if(cqFormField.hasRadioIsCheck(fields,CQFormField.PART_52C_YES_1)){
            cqFormField.part52cYes1=CQFormField.PART_52C_YES_1;
        }
        System.out.println("【Part 5.2.c.(1) Yes】 is "+cqFormField.part52cYes1);

        //Part 5.2.c.(2) Yes
        if(cqFormField.hasRadioIsCheck(fields,CQFormField.PART_52C_YES_2)){
            cqFormField.part52cYes2=CQFormField.PART_52C_YES_2;
        }
        System.out.println("【Part 5.2.c.(2) Yes】 is "+cqFormField.part52cYes2);

        //Part 5.2.c.(3) Yes
        if(cqFormField.hasRadioIsCheck(fields,CQFormField.PART_52C_YES_3)){
            cqFormField.part52cYes3=CQFormField.PART_52C_YES_3;
        }
        System.out.println("【Part 5.2.c.(3) Yes】 is "+cqFormField.part52cYes3);

        //Part 5.2.c.(4) Yes
        if(cqFormField.hasRadioIsCheck(fields,CQFormField.PART_52C_YES_4)){
            cqFormField.part52cYes4=CQFormField.PART_52C_YES_4;
        }
        System.out.println("【Part 5.2.c.(4) Yes】 is "+cqFormField.part52cYes4);

        //Part 5.2.c.(5) Yes
        if(cqFormField.hasRadioIsCheck(fields,CQFormField.PART_52C_YES_5)){
            cqFormField.part52cYes5=CQFormField.PART_52C_YES_5;
        }
        System.out.println("【Part 5.2.c.(5) Yes】 is "+cqFormField.part52cYes5);

        //Part 5.2.c.(6) Yes
        if(cqFormField.hasRadioIsCheck(fields,CQFormField.PART_52C_YES_6)){
            cqFormField.part52cYes6=CQFormField.PART_52C_YES_6;
        }
        System.out.println("【Part 5.2.c.(6) Yes】 is "+cqFormField.part52cYes6);

        //Part 5.2.c.(7) Yes
        if(cqFormField.hasRadioIsCheck(fields,CQFormField.PART_52C_YES_7)){
            cqFormField.part52cYes7=CQFormField.PART_52C_YES_7;
        }
        System.out.println("【Part 5.2.c.(7) Yes】 is "+cqFormField.part52cYes7);

        // mapping excel
        RbaExcelObj rbaExcelObj=new RbaExcelObj();
        rbaExcelObj.initRbaField();
        rbaExcelObj.resetFieldsValue(cqFormField);
        rbaExcelObj.formatFieldsValue();
        rbaExcelObj.writeLogs();

        // read excel temp

        // write excel temp



        pdf.close();

    }





}
