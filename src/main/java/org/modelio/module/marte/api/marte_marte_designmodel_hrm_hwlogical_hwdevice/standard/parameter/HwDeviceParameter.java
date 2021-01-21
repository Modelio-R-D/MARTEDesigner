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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.parameter.HwResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwDevice_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("3dacc103-ba87-4956-b368-e9d719cac658")
public class HwDeviceParameter extends HwResourceParameter {
    @objid ("084293e5-3da6-490b-9e5c-7875b028b2ac")
    public static final String STEREOTYPE_NAME = "HwDevice_Parameter";

    @objid ("49958d31-7781-4cc7-a1bd-468d553222b8")
    public static final String HWDEVICE_PARAMETER_MAINSCHEDULER_TAGTYPE = "HwDevice_Parameter_mainScheduler";

    @objid ("6383021a-48f2-4cad-a902-3cec8b8e826b")
    public static final String HWDEVICE_PARAMETER_SPEEDFACTOR_TAGTYPE = "HwDevice_Parameter_speedFactor";

    /**
     * Tells whether a {@link HwDeviceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwDevice_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4c42b75e-eb25-4467-85e1-31b2d14cfe81")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDeviceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwDevice_Parameter >> then instantiate a {@link HwDeviceParameter} proxy.
     * 
     * @return a {@link HwDeviceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("9c8aa65a-bba2-4223-94b6-65f6432e72f7")
    public static HwDeviceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDeviceParameter.STEREOTYPE_NAME);
        return HwDeviceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwDeviceParameter} proxy from a {@link Parameter} stereotyped << HwDevice_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwDeviceParameter} proxy or <i>null</i>.
     */
    @objid ("6364b64b-83b2-402c-8ecc-4355242f6933")
    public static HwDeviceParameter instantiate(final Parameter obj) {
        return HwDeviceParameter.canInstantiate(obj) ? new HwDeviceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDeviceParameter} proxy from a {@link Parameter} stereotyped << HwDevice_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwDeviceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f562684d-b49b-4831-9760-fd594c77d79d")
    public static HwDeviceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwDeviceParameter.canInstantiate(obj))
        	return new HwDeviceParameter(obj);
        else
        	throw new IllegalArgumentException("HwDeviceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("45d868ba-42a5-443a-bae1-31d9eb659b6b")
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
        HwDeviceParameter other = (HwDeviceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("bf8eb89f-d1a6-49d5-8c6e-3f5f0839db90")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwDevice_Parameter_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("18249e82-f7fb-4772-a75f-6236f4ddf7db")
    public String getHwDevice_Parameter_mainScheduler() {
        return this.elt.getTagValue(HwDeviceParameter.MdaTypes.HWDEVICE_PARAMETER_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDevice_Parameter_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d6e87393-1157-41c1-a73b-3a4dbc6203ec")
    public String getHwDevice_Parameter_speedFactor() {
        return this.elt.getTagValue(HwDeviceParameter.MdaTypes.HWDEVICE_PARAMETER_SPEEDFACTOR_TAGTYPE_ELT);
    }

    @objid ("a2768a4f-f169-49d4-864e-60cb37efaeb3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDevice_Parameter_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1e2f59ea-4384-44f6-842d-fa1652420a8c")
    public void setHwDevice_Parameter_mainScheduler(final String value) {
        this.elt.putTagValue(HwDeviceParameter.MdaTypes.HWDEVICE_PARAMETER_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDevice_Parameter_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4480968c-6d7e-4d7a-86c4-1266612a2ca8")
    public void setHwDevice_Parameter_speedFactor(final String value) {
        this.elt.putTagValue(HwDeviceParameter.MdaTypes.HWDEVICE_PARAMETER_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    @objid ("a1542f7b-abb8-4ddb-9d4b-e0ad063d8a8a")
    protected HwDeviceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("9fcc2329-780a-4a1e-8509-683ce0febb8b")
    public static final class MdaTypes {
        @objid ("91ef6926-ab5b-4152-b197-593d927d66c8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("62976abb-27cb-41ec-b62b-7e06e7ca2e1a")
        public static TagType HWDEVICE_PARAMETER_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("27f627eb-132a-4b6a-af98-32263354dc5a")
        public static TagType HWDEVICE_PARAMETER_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("aff9bccd-b9b6-43ef-9af9-3ef57fea3823")
        private static Stereotype MDAASSOCDEP;

        @objid ("8c7eea05-09d0-46b2-a140-f24a57d9d8dc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("86907826-7db6-43c1-85a5-90333b2a2b2c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0130b6fc-0ccf-11df-8525-001302895b2b");
            HWDEVICE_PARAMETER_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "551a9ef2-92ab-11e0-a69d-0027103f347c");
            HWDEVICE_PARAMETER_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "551a9ef3-92ab-11e0-a69d-0027103f347c");
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
