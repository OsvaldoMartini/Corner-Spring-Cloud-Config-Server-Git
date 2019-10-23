### Search Paths

* Search for the paths


	localhost:8888/s1rates/default
	
	localhost:8888/s1rates/master
	
	localhost:8888/s1rates/dev
	
	localhost:8888/s1rates/qa
	
	
	if I search for:
	
	localhost:8888/s2rates/qa it returns only "s2rates.properties" & "application.properties" 
	
	because I don't have 's12ates-qa.properties' defined anywhere

````json
{
    "name": "s2rates",
    "profiles": [
        "qa"
    ],
    "label": "master",
    "version": "0d9a7a072da1576a450578b542d071b3c5138268",
    "propertySources": [
        {
            "name": "https://github.com/OsvaldoMartini/PPMTool-Spring-Cloud-Config-Wa-Tolls/station2/s2rates.properties",
            "source": {
                "rate": "1.65",
                "lanecount": "3"
            }
        },
        {
            "name": "https://github.com/OsvaldoMartini/PPMTool-Spring-Cloud-Config-Wa-Tolls/application.properties",
            "source": {
                "tollstart": "05:00",
                "tollstop": "22:00",
                "rate": "1.55",
                "lanecount": "0"
            }
        }
    ]
}
````
	
	If a search for : localhost:8888/s1rates/qa
	
	I get back :
	"s1rates-qa.properties" & "s1rates.properties" & "application.properties" 
	
	Direct search for the properties:
	
	'localhost:8888/s1rates-default.properties' or
	
	'localhost:8888/s1rates-default.json' or
	
	'localhost:8888/s1rates-default.yml'
	
	If Don't exist it returns the 'Defaul One'
	
	localhost:8888/s1rates-MellGibson.json
	
	
### Sear  for the Performance GitHub Repo

	localhost:8888/s1rates/perf	