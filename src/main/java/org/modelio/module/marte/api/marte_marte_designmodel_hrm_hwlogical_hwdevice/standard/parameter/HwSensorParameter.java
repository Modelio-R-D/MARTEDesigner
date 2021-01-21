/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.parameter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwSensor_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("38746b9a-c8cb-48ea-924d-3c747c53181d")
public class HwSensorParameter extends HwIOParameter {
    @objid ("0b95ee81-e87c-48a9-84b9-575d21dc3240")
    public static final String STEREOTYPE_NAME = "HwSensor_Parameter";

    /**
     * Tells whether a {@link HwSensorParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwSensor_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("443fefcc-662b-4051-8a53-f64ada53d8b2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwSensorParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwSensor_Parameter >> then instantiate a {@link HwSensorParameter} proxy.
     * 
     * @return a {@link HwSensorParameter} proxy on the created {@link Parameter}.
     */
    @objid ("d22633f1-5324-407d-89dc-2ee6cba4cdc8")
    public static HwSensorParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwSensorParameter.STEREOTYPE_NAME);
        return HwSensorParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwSensorParameter} proxy from a {@link Parameter} stereotyped << HwSensor_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwSensorParameter} proxy or <i>null</i>.
     */
    @objid ("f9cbbe62-0727-4472-9a2e-1c5c98a682be")
    public static HwSensorParameter instantiate(final Parameter obj) {
        return HwSensorParameter.canInstantiate(obj) ? new HwSensorParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwSensorParameter} proxy from a {@link Parameter} stereotyped << HwSensor_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwSensorParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("04fa4be7-484c-49bc-b9ec-57ddfee64dad")
    public static HwSensorParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwSensorParameter.canInstantiate(obj))
        	return new HwSensorParameter(obj);
        else
        	throw new IllegalArgumentException("HwSensorParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f1d578c1-8441-4622-9aab-3b72a3a408d1")
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
        HwSensorParameter other = (HwSensorParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("08da679c-fbb5-46cb-aba4-07d4bde6aa90")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @objid ("0ccea5cc-43d8-43df-b9a8-263c9de3b6b8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a1619de4-df19-4eec-848a-003025007670")
    protected HwSensorParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("e9ebef88-6b0a-4183-8c2b-561792ddb948")
    public static final class MdaTypes {
        @objid ("65db5ede-c755-4ae4-960a-e16319db3c37")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("27f4cb44-994a-49f6-b24b-2edbb8fd5f4f")
        private static Stereotype MDAASSOCDEP;

        @objid ("93834282-2e63-48f3-b3ea-6bab1344b376")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c690c8cf-afb0-4b51-895d-dfa884d3fc8b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e8a04aa7-c7ac-11df-ad39-001302895b2b");
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
