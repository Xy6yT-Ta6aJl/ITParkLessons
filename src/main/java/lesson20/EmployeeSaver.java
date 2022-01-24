package lesson20;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class EmployeeSaver {

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setName("Boris Ivanov");
        employee.setId(33456);
        employee.setLogin("Boris86");
        employee.setDepartament(new Departament("Moscow", "Gorsvet"));
        employee.setPositon(new Positon("Installer", 50_000));

        jaxbObjectToXML(employee);

    }


    private static void jaxbObjectToXML(Employee employee)
    {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

            //Print XML String to Console
            jaxbMarshaller.marshal(employee, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
