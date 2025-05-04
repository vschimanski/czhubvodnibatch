# cz.hub.vodni.batch
spring 5 batch check
java -jar target/batch-0.0.1-SNAPSHOT.jar --spring.batch.job.name=jobScheduledOutput
java -jar target/batch-0.0.1-SNAPSHOT.jar --spring.batch.job.name=jobScheduledOutput2

.sql("INSERT INTO table_name (var_name1, var_name2, var_name3) VALUES (:varName1, :varName2 , :varName3)")

.query("SELECT var_name1, var_name2 , var_name3 FROM table_name", new DataClassRowMapper<>(DataClass.class))
