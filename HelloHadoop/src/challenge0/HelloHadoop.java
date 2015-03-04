package challenge0;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.Job;

public class HelloHadoop {

  public static void main(String[] args) throws Exception {

    if (args.length != 2) {
      System.out.printf("Usage: Hello Hadoop <input dir> <output dir>\n");
      System.exit(-1);
    }
    
    Configuration conf = new Configuration(); 
	Job job = Job.getInstance(conf); 
	
    FileInputFormat.setInputPaths(job, new Path(args[0]));
    FileOutputFormat.setOutputPath(job, new Path(args[1]));
	
	/*To-Do: Implement the Job configuration
	 *  1. Set properties for the following methods on Job class instance: 
	 *     setJarByClass
	 *     setJobName
	 *     setMapperClass
	 *     setReducerClass
	 *     setMapOutputKeyClass
	 *     setMapOutputValueClass
	 *     setOutputKeyClass
	 *     setOutputValueClass
	 *  2. Import any required libraries    
	 */
	
    boolean success = job.waitForCompletion(true);
    System.exit(success ? 0 : 1);
  }
}
