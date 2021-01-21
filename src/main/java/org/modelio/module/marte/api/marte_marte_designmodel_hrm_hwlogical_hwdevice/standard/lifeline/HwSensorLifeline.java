/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwSensor_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ee36b2e0-5136-4e47-8cab-d006f7e3ff82")
public class HwSensorLifeline extends HwIOLifeline {
    @objid ("96363f8d-df4e-492b-a472-14095641386d")
    public static final String STEREOTYPE_NAME = "HwSensor_Lifeline";

    /**
     * Tells whether a {@link HwSensorLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwSensor_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e25bbf44-80d2-496f-a4e9-07b770cd019b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwSensorLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwSensor_Lifeline >> then instantiate a {@link HwSensorLifeline} proxy.
     * 
     * @return a {@link HwSensorLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("de86f9c9-566b-4e7c-b254-e47bcaf1e66a")
    public static HwSensorLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwSensorLifeline.STEREOTYPE_NAME);
        return HwSensorLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwSensorLifeline} proxy from a {@link Lifeline} stereotyped << HwSensor_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwSensorLifeline} proxy or <i>null</i>.
     */
    @objid ("5ec3d78b-f947-4208-9377-143adc0bb6e1")
    public static HwSensorLifeline instantiate(final Lifeline obj) {
        return HwSensorLifeline.canInstantiate(obj) ? new HwSensorLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwSensorLifeline} proxy from a {@link Lifeline} stereotyped << HwSensor_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwSensorLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ecfdc7fe-c556-41c8-97fd-7ca4e42ca64f")
    public static HwSensorLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwSensorLifeline.canInstantiate(obj))
        	return new HwSensorLifeline(obj);
        else
        	throw new IllegalArgumentException("HwSensorLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b4ae0c99-70fc-417f-850b-b0771761435f")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        HwSensorLifeline other = (HwSensorLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("7dfc16fb-945a-47cb-8de3-723f19a63320")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    @objid ("1b69aa00-f4dc-44ef-b587-a0d4c0a5d7c0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e9447060-acef-4e3c-94fb-5fdbeee11508")
    protected HwSensorLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("b7938a78-ea64-4152-b1d0-c5af2b3c7886")
    public static final class MdaTypes {
        @objid ("73c86db0-4a94-4452-ada6-c8258dd3fe66")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("96b76628-d23e-450d-910f-f81d797a197a")
        private static Stereotype MDAASSOCDEP;

        @objid ("adbcb055-44d2-4d62-8385-987468ff14cf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e48f776b-65ce-4b15-981c-1199e46d52a0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e89de84d-c7ac-11df-ad39-001302895b2b");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
