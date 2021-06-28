package taboolib.module.configuration

@Target(AnnotationTarget.FIELD)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class Config(val value: String = "config.yml")