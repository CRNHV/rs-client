package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Void;
import org.jetbrains.annotations.NotNull;

/**
 * public final class
 */
public interface XProjectile extends Accessor, XEntity {
	/**
	 * @see XProjectile#advance(int)
	 */
	@NotNull
	MethodExecution<XProjectile, Void> advance = new MethodExecution.Implementation();

	/**
	 * @see XProjectile#getModel()
	 */
	@NotNull
	MethodExecution<XProjectile, XModel> getModel = new MethodExecution.Implementation();

	/**
	 * @see XProjectile#setDestination(int, int, int, int)
	 */
	@NotNull
	MethodExecution<XProjectile, Void> setDestination = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	double getAccelerationZ();

	/**
	 *  field
	 */
	void setAccelerationZ(double value);

	/**
	 *  field
	 */
	int getCycleEnd();

	/**
	 *  field
	 */
	void setCycleEnd(int value);

	/**
	 *  field
	 */
	int getCycleStart();

	/**
	 *  field
	 */
	void setCycleStart(int value);

	/**
	 *  field
	 */
	int getFrame();

	/**
	 *  field
	 */
	void setFrame(int value);

	/**
	 *  field
	 */
	int getFrameCycle();

	/**
	 *  field
	 */
	void setFrameCycle(int value);

	/**
	 *  field
	 */
	int getId();

	/**
	 *  field
	 */
	void setId(int value);

	/**
	 *  field
	 */
	int getInt3();

	/**
	 *  field
	 */
	void setInt3(int value);

	/**
	 *  field
	 */
	int getInt4();

	/**
	 *  field
	 */
	void setInt4(int value);

	/**
	 *  field
	 */
	int getInt5();

	/**
	 *  field
	 */
	void setInt5(int value);

	/**
	 *  field
	 */
	boolean getIsMoving();

	/**
	 *  field
	 */
	void setIsMoving(boolean value);

	/**
	 *  field
	 */
	int getPitch();

	/**
	 *  field
	 */
	void setPitch(int value);

	/**
	 *  field
	 */
	int getPlane();

	/**
	 *  field
	 */
	void setPlane(int value);

	/**
	 *  field
	 */
	XSeqType getSeqType();

	/**
	 *  field
	 */
	void setSeqType(XSeqType value);

	/**
	 *  field
	 */
	int getSourceX();

	/**
	 *  field
	 */
	void setSourceX(int value);

	/**
	 *  field
	 */
	int getSourceY();

	/**
	 *  field
	 */
	void setSourceY(int value);

	/**
	 *  field
	 */
	int getSourceZ();

	/**
	 *  field
	 */
	void setSourceZ(int value);

	/**
	 *  field
	 */
	double getSpeed();

	/**
	 *  field
	 */
	void setSpeed(double value);

	/**
	 *  field
	 */
	double getSpeedX();

	/**
	 *  field
	 */
	void setSpeedX(double value);

	/**
	 *  field
	 */
	double getSpeedY();

	/**
	 *  field
	 */
	void setSpeedY(double value);

	/**
	 *  field
	 */
	double getSpeedZ();

	/**
	 *  field
	 */
	void setSpeedZ(double value);

	/**
	 *  field
	 */
	int getTargetIndex();

	/**
	 *  field
	 */
	void setTargetIndex(int value);

	/**
	 *  field
	 */
	double getX();

	/**
	 *  field
	 */
	void setX(double value);

	/**
	 *  field
	 */
	double getY();

	/**
	 *  field
	 */
	void setY(double value);

	/**
	 *  field
	 */
	int getYaw();

	/**
	 *  field
	 */
	void setYaw(int value);

	/**
	 *  field
	 */
	double getZ();

	/**
	 *  field
	 */
	void setZ(double value);

	/**
	 * final method
	 */
	void advance(int cycles);

	/**
	 * protected final method
	 */
	XModel getModel();

	/**
	 * final method
	 */
	void setDestination(int x, int y, int height, int cycle);
}
