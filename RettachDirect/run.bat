set projectLocation=http://localhost:8080/job/DealRoom/ws/RettachDirect/
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause