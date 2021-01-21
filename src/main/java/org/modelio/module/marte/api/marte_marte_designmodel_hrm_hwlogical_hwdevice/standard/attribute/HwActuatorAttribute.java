/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwActuator_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("328cac1d-5c9a-44ae-928c-9c22115fa52a")
public class HwActuatorAttribute extends HwIOAttribute {
    @objid ("93ea8b76-f510-44ba-b251-c1d5f0cd71c7")
    public static final String STEREOTYPE_NAME = "HwActuator_Attribute";

    /**
     * Tells whether a {@link HwActuatorAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwActuator_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8b6e8136-c57b-4b5e-8770-b3ea69c11bb4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwActuatorAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwActuator_Attribute >> then instantiate a {@link HwActuatorAttribute} proxy.
     * 
     * @return a {@link HwActuatorAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("99df87d4-0419-4cf2-a2da-94d4aa6e13c3")
    public static HwActuatorAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwActuatorAttribute.STEREOTYPE_NAME);
        return HwActuatorAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwActuatorAttribute} proxy from a {@link Attribute} stereotyped << HwActuator_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwActuatorAttribute} proxy or <i>null</i>.
     */
    @objid ("6d4c6fe9-5b69-4170-92ff-e1a7fb86a892")
    public static HwActuatorAttribute instantiate(final Attribute obj) {
        return HwActuatorAttribute.canInstantiate(obj) ? new HwActuatorAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwActuatorAttribute} proxy from a {@link Attribute} stereotyped << HwActuator_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwActuatorAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("74e2ac69-ed6e-4813-a652-d4f2e07f9729")
    public static HwActuatorAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwActuatorAttribute.canInstantiate(obj))
        	return new HwActuatorAttribute(obj);
        else
        	throw new IllegalArgumentException("HwActuatorAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("333c3d77-002a-4b3f-955f-6b84c60c667b")
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
        HwActuatorAttribute other = (HwActuatorAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("5b093870-daef-4c54-a126-9d5b208782b8")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("0928e143-b3d6-4a2e-877f-23651eb14898")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("70c00d34-95a2-4ef5-aa84-84265113d078")
    protected HwActuatorAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("5ccc30e1-5957-4bc4-8b4a-18e05e91f882")
    public static final class MdaTypes {
        @objid ("107cdcf2-c387-4eac-b220-202294efa1cb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("75050582-0078-4525-a18c-1ad3f83fe050")
        private static Stereotype MDAASSOCDEP;

        @objid ("5181677e-86ea-4b51-a922-779fd0ed594b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("def2ae8f-a362-4649-9468-9ad55f14b22f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "88a37411-c7ac-11df-ad39-001302895b2b");
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
