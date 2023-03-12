import scala.io.Source
import scala.collection.mutable.ListBuffer

@main def main() = {
        val path = "C:/Users/Mukesh/Desktop/personal-github/scala/geeks-for-geeks/employee-details.csv";
        var file_obj = Source.fromFile(path)

        var row_counter = 1;
        var header_delimiter_count = 0;
        var incorrect_delimiter_count_list = new ListBuffer[Int]();

        for(line <- file_obj.getLines){

            if(row_counter == 1){
                header_delimiter_count = line.count(_ == ',');
                
            }
            else{
                var row_delimiter_count = line.count(_ == ',');

                // println(line + " -> " + row_delimiter_count + header_delimiter_count);

                if(row_delimiter_count != header_delimiter_count){
                    incorrect_delimiter_count_list += row_counter;
                }
            }

            row_counter+=1 ;
        
        }

        print("Line number with incorrect delimiter - ");

        for(row <- incorrect_delimiter_count_list) println(row);

        }
