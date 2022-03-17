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

        System.out.println(cqFormField.applicantTypeQ1);


        // mapping excel


        // read excel temp

        // write excel temp



        pdf.close();

    }





}
