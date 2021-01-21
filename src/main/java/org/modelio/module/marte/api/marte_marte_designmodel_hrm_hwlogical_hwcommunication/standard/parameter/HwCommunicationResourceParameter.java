/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.parameter;

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
 * Proxy class to handle a {@link Parameter} with << HwCommunicationResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c9152405-bc8b-4983-b688-a56a63d3e50d")
public class HwCommunicationResourceParameter extends HwResourceParameter {
    @objid ("25e9768f-d32e-4aa7-adc3-37b3d755741f")
    public static final String STEREOTYPE_NAME = "HwCommunicationResource_Parameter";

    /**
     * Tells whether a {@link HwCommunicationResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwCommunicationResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("07e210f5-9c40-4678-9ec3-728cc7d78274")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCommunicationResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwCommunicationResource_Parameter >> then instantiate a {@link HwCommunicationResourceParameter} proxy.
     * 
     * @return a {@link HwCommunicationResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("eb3ebe58-451b-4509-8b00-bf69f6b95000")
    public static HwCommunicationResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCommunicationResourceParameter.STEREOTYPE_NAME);
        return HwCommunicationResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwCommunicationResourceParameter} proxy from a {@link Parameter} stereotyped << HwCommunicationResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwCommunicationResourceParameter} proxy or <i>null</i>.
     */
    @objid ("c986adf1-4ef1-47ba-b276-f2a946ee7da2")
    public static HwCommunicationResourceParameter instantiate(final Parameter obj) {
        return HwCommunicationResourceParameter.canInstantiate(obj) ? new HwCommunicationResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCommunicationResourceParameter} proxy from a {@link Parameter} stereotyped << HwCommunicationResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwCommunicationResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e2f3488c-569b-40f8-9966-eb3cb2e8161d")
    public static HwCommunicationResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwCommunicationResourceParameter.canInstantiate(obj))
        	return new HwCommunicationResourceParameter(obj);
        else
        	throw new IllegalArgumentException("HwCommunicationResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7c45c743-c4b3-4ee6-ab62-d661806a86e7")
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
        HwCommunicationResourceParameter other = (HwCommunicationResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("a1fff61d-07f1-4cda-b84a-8e0a7e809ee8")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @objid ("d2e299ab-aeeb-4b82-8896-4e1ade90341d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c8be090a-5c78-49f8-9a59-8112a5ebf4a9")
    protected HwCommunicationResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("0c567160-5c21-4b48-ab42-1c918eddee27")
    public static final class MdaTypes {
        @objid ("5d2af00d-1897-4643-adb5-8ba98c945d4d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6cc00365-5670-4ce5-8465-3e225fbf615a")
        private static Stereotype MDAASSOCDEP;

        @objid ("e162c449-299e-4f02-96da-b1ecf59465f6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7df4fae2-7fc0-4b98-ac40-9bea25889a74")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00fea642-0ccf-11df-8525-001302895b2b");
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
