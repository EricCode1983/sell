SPRING BOOT+ JPA+MYSQL
--pending task
auto gernate table use yaml

Controller->Service (Interface)->ServiceImpl(class,@Service)->Repository (Interface extends Jpa)->DAO(database object entity @Entity)->database
return view to controller<-


1 Spring Initilazer
2 Log - Logback+SLF4j  (JUL,JCL,Log4j,SLF4j,jobss-logging)
3 org.projectlombok -  (@Data,@Get) not need write getter,setter and tostring function
4 @DynamicUpdate with  (on update current_timestamp comment: mysql scripts) can auto update the create time and edit time
5 @Transactional for test , will not impact the database. For example : after you add data to database then will auto detete it
6 @Service
7 Chrom plugin to easy check json data jsonview
8 @JsonProperty 解决前端Json的命名和后端不一致
9 BeanUtils.copyProperties 用在 daoObject to viewObject or viewObject to daoObject

