 public class LAB2HA1R{
        public static void main(String[] args) {
            Student S=new Student();
            S.Name="AZIZ NASEER";
            S.Roll_no=021;
            S.Section='A';
            S.Degree="Software engineering";
            System.out.println(" *My name is "+S.Name+"\n *My roll number is "+S.Roll_no);
            System.out.println(" *My section is "+S.Section+"\n *And i Am doing  "+S.Degree);
            S.Study();
            S.play();
            S.ragging();

        }

    }


