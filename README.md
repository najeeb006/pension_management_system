--------------------------------------------------------------------------------------------------------------------------------------------
-----------------    Front-end  ==  PensionManagementSystem ( running on port 4200, accessed at http://localhost:4200) ---------------------
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



--------------------------------------------------------------------------------------------------------------------------------------------
-----------------                       Back-end                     ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

-------  AUTHOTIZATION-MICROSERVICE -  (microservice for authorization, URL = http://localhost:9090)

--- http://localhost:9090/authenticate - post method
--- http://localhost:9090/authorize - get method 

-------  PENSIONER-DETAIL-MICROSERVICE - (microservice which provides the details of penioner, URL = http://localhost:9100)

--- http://localhost:9100/details - get method
--- http//localhost:9100/PensionerDetailByAadhaar/{aadhaarNumber} - get method

-------  PROCESS-PENSION-MICROSERVICE - (microservice which calculates the pension amount, URL = http://localhost:9200)

--- http://localhost:9200/details - get method
--- http//localhost:9200/ProcessPension - post method
--- http://localhost:9200/pensionStatus - post method



-------  PENSION - VALIDATION-MICROSERVICE - (microsservice which checks the validity of the pension amount, URL = http://localhost:8000)

--- http://localhost:8000/pensionStatus - post method



-------  PENSION-MANAGEMENT-PORTAL - (microservice which communicates with rest of the microservices, URL = http://localhost:9080)

--- http://localhost:9080/token - post method
--- http://localhost:9080/details - get method
--- http//localhost:9080/ProcessPension - post method
--- http://localhost:9080/pensionStatus - post method

---------------------------------------------------------------------------------------------------------------------------------
