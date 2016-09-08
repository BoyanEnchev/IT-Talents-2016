import java.time.LocalDateTime;

public class History {

	private LocalDateTime startDate;
	private LocalDateTime endDate;
	
	
	
	public History(LocalDateTime startDate, LocalDateTime endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public LocalDateTime getStartDate() {
		return startDate;
	}
	public LocalDateTime getEndDate() {
		return endDate;
	}
	
	
}
