docker run -d --rm \
--name=mongodb-fdp \
-v ~/test-fdp/practica_big_data_2019/data:/data/fdp \
-p 27017-27019:27017-27019 \
mongo:latest