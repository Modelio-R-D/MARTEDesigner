/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Parameter} with << HwI_O_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f5985ac7-61b8-43cf-bbce-6bf2df930324")
public class HwIOParameter extends HwDeviceParameter {
    @objid ("c6b7e8a1-daa2-4867-bba6-3776d434b530")
    public static final String STEREOTYPE_NAME = "HwI_O_Parameter";

    /**
     * Tells whether a {@link HwIOParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwI_O_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a9389dce-5cd7-4227-b1e7-29f9fe44b23c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwIOParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwI_O_Parameter >> then instantiate a {@link HwIOParameter} proxy.
     * 
     * @return a {@link HwIOParameter} proxy on the created {@link Parameter}.
     */
    @objid ("3c6ba178-9d53-407a-a721-754b8ed91970")
    public static HwIOParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwIOParameter.STEREOTYPE_NAME);
        return HwIOParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwIOParameter} proxy from a {@link Parameter} stereotyped << HwI_O_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwIOParameter} proxy or <i>null</i>.
     */
    @objid ("eb7db567-d67d-4bac-87ed-ea72abadffc9")
    public static HwIOParameter instantiate(final Parameter obj) {
        return HwIOParameter.canInstantiate(obj) ? new HwIOParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwIOParameter} proxy from a {@link Parameter} stereotyped << HwI_O_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwIOParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2451646f-c1a7-41cd-bf8c-1f2619600c34")
    public static HwIOParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwIOParameter.canInstantiate(obj))
        	return new HwIOParameter(obj);
        else
        	throw new IllegalArgumentException("HwIOParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("85209e2c-e7a6-412a-8362-3c0d3c912acb")
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
        HwIOParameter other = (HwIOParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("86367f28-2d20-4f64-a810-e0d24cd7f986")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @objid ("444f21f1-01fb-4303-8570-f1686cadfc34")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b08dc1fd-7603-4ef1-a592-40665c6b435b")
    protected HwIOParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("39bce26b-205a-4e31-9988-40271f6fbd2e")
    public static final class MdaTypes {
        @objid ("022590dd-babd-45b2-8ad3-64f022995008")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("eae30ef8-1237-4ee4-a810-d322ca076c1b")
        private static Stereotype MDAASSOCDEP;

        @objid ("81d9bc38-f24d-4d4c-a887-491bc3eacc66")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ba9dd430-d428-4e2b-aeb2-70cd38a48a14")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0137ddf2-0ccf-11df-8525-001302895b2b");
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
