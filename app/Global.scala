import filters.AddDefaultResponseHeader
import play.api.mvc.WithFilters

object Global extends WithFilters(AddDefaultResponseHeader)