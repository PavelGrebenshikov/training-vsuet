import requests
import json
from pprint import pprint

def use_api():
   name = "apache/spark"
   username = name.split("/")[0]
   get_data_repos = f"https://api.github.com/repos/{name}"
   get_user_data = f"https://api.github.com/users/{username}"
   
   response_repos = requests.get(get_data_repos)
   response_user = requests.get(get_user_data)
   if response_repos.status_code == 200 and response_user.status_code == 200:
      with open("get_json_data.json", encoding="utf-8", mode="w+") as file:

           response_items = {
               "repos": response_repos.json(),
               "users": response_user.json(),
           }

           data_items = {
               "data": {
                  "company": response_items["users"]["company"],
                  "email": response_items["users"]["email"],
                  "id": response_items["repos"]["id"],
                  "created_at": response_items["repos"]["created_at"],
                  "name": response_items["repos"]["name"],
                  "url": response_items["repos"]["url"],
               }
           }

           json.dump(data_items, file, indent=4)

   else:
      return "Соединение не удалось"


use_api()
