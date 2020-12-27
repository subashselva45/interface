package Run;

import io.pragra.learning.*;



public class Testrun {
    public static void main(String[] args) {
       /* IEmployee employee = new Contractor();
        employee.hire();
        Iprint employee1 = new Contractor();
        employee1.printdetails();
        Person person = new Contractor();*/

       /* Iwork work = new Iwork() {
            @Override
            public void work() {
                System.out.println("working");
            }
        };

        work.work();

        abc(work);


    }

      static void abc(Iwork work){
        work.work();
      }*/
       /*abc((logLevel,msg)->
                "message is"+msg

        );

        }
        static void abc(Logger log) {
             String str=log.log("2", "hi have a good day");
            System.out.println(str);


        }*/
     abc((f,c)-> { return f+c;});
    }
    static void abc(Sum obj){
       int addition=obj.add(8,9);
        System.out.println(addition);
    }
}


