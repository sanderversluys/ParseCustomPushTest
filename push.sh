curl -X POST \
  -H "X-Parse-Application-Id: vtSL0B6rTt2fUm1gLBqIa8J6EkBFls2aCAXFziA3" \
  -H "X-Parse-REST-API-Key: rlqXlwF6xQMp0KQiHOwEP5Roo8eVQ4UnEk4SVSfI" \
  -H "Content-Type: application/json" \
  -d '{
        "channels": [
          "test"
        ],
        "data": {
          "action": "com.parse.UPDATE_PUSH",
          "alert": "The Mets scored! The game is now tied 1-1.",
          "badge": "Increment",
          "sound": "cheering.caf",
          "title": "Mets Score!"
        }
      }' \
  https://api.parse.com/1/push