/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.parameter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
 * Proxy class to handle a {@link Parameter} with << HwBridge_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e2aa22b6-4d24-4184-bb45-5a89aba9cc65")
public class HwBridgeParameter extends HwMediaParameter {
    @objid ("6b276423-c4ea-40c2-a056-f5a9f93d03a7")
    public static final String STEREOTYPE_NAME = "HwBridge_Parameter";

    @objid ("8658a127-effa-4593-900b-d015bf9f3ae0")
    public static final String HWBRIDGE_PARAMETER_SIDES_TAGTYPE = "HwBridge_Parameter_sides";

    /**
     * Tells whether a {@link HwBridgeParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwBridge_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6c19ab63-049f-435f-9e29-e85600edfb5d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwBridge_Parameter >> then instantiate a {@link HwBridgeParameter} proxy.
     * 
     * @return a {@link HwBridgeParameter} proxy on the created {@link Parameter}.
     */
    @objid ("c91d11d6-5fe3-4fb4-8ed2-126272e1ba4f")
    public static HwBridgeParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeParameter.STEREOTYPE_NAME);
        return HwBridgeParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwBridgeParameter} proxy from a {@link Parameter} stereotyped << HwBridge_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwBridgeParameter} proxy or <i>null</i>.
     */
    @objid ("5de698a0-4923-4d3e-81d8-1a2070c9f082")
    public static HwBridgeParameter instantiate(final Parameter obj) {
        return HwBridgeParameter.canInstantiate(obj) ? new HwBridgeParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBridgeParameter} proxy from a {@link Parameter} stereotyped << HwBridge_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwBridgeParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("66a502ff-ddb4-4d41-a1bd-1f8821d8f877")
    public static HwBridgeParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwBridgeParameter.canInstantiate(obj))
        	return new HwBridgeParameter(obj);
        else
        	throw new IllegalArgumentException("HwBridgeParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d5ecb125-33ac-4170-8ef0-67305dfeaf1b")
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
        HwBridgeParameter other = (HwBridgeParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("39f452ea-e903-4c31-931d-fc6f1b62e9e5")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwBridge_Parameter_sides'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5bca6f82-fcbe-448f-bc01-f86199b80654")
    public List<String> getHwBridge_Parameter_sides() {
        return this.elt.getTagValues(HwBridgeParameter.MdaTypes.HWBRIDGE_PARAMETER_SIDES_TAGTYPE_ELT);
    }

    @objid ("68f42a47-f4a5-4375-a164-f5b6dfd863a9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwBridge_Parameter_sides'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ba512127-0728-46d3-9627-2bf96a3c5af0")
    public void setHwBridge_Parameter_sides(final List<String> values) {
        this.elt.putTagValues(HwBridgeParameter.MdaTypes.HWBRIDGE_PARAMETER_SIDES_TAGTYPE_ELT, values);
    }

    @objid ("63607cf5-b46f-4eb0-875b-9cd52b599f24")
    protected HwBridgeParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("fd219a5f-7006-471a-93b0-c691a2b35479")
    public static final class MdaTypes {
        @objid ("77b590ad-3cc9-40f2-be72-8a243eec60bc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("866d9e61-8f3d-41c0-9cdd-fbf65f49fedf")
        public static TagType HWBRIDGE_PARAMETER_SIDES_TAGTYPE_ELT;

        @objid ("17bb453b-5ece-4f4e-a30f-e036b0c96716")
        private static Stereotype MDAASSOCDEP;

        @objid ("4b854571-49f6-4229-891e-ca2630be3fdf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3d7c2d43-c465-411e-9a92-4a23c2a5da46")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0118dfc8-0ccf-11df-8525-001302895b2b");
            HWBRIDGE_PARAMETER_SIDES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c2d94b61-1726-11df-b92a-0014222a9f79");
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
