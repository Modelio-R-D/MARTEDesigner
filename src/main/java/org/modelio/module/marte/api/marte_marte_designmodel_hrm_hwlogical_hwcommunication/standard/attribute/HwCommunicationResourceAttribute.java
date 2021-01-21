/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.attribute;

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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.attribute.HwResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwCommunicationResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("0d5afcde-d15d-4efa-9292-de742b635a74")
public class HwCommunicationResourceAttribute extends HwResourceAttribute {
    @objid ("9c390e45-1bb8-479f-9ecd-1fb7ab31ab58")
    public static final String STEREOTYPE_NAME = "HwCommunicationResource_Attribute";

    /**
     * Tells whether a {@link HwCommunicationResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwCommunicationResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("61fd7e17-3c21-4aa1-82c1-0f673cd0a753")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCommunicationResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwCommunicationResource_Attribute >> then instantiate a {@link HwCommunicationResourceAttribute} proxy.
     * 
     * @return a {@link HwCommunicationResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("77139258-2c68-4155-96c4-c135e9dc9d45")
    public static HwCommunicationResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCommunicationResourceAttribute.STEREOTYPE_NAME);
        return HwCommunicationResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwCommunicationResourceAttribute} proxy from a {@link Attribute} stereotyped << HwCommunicationResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwCommunicationResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("864d50e3-19a4-4d1e-a2ed-3ba2ca373247")
    public static HwCommunicationResourceAttribute instantiate(final Attribute obj) {
        return HwCommunicationResourceAttribute.canInstantiate(obj) ? new HwCommunicationResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCommunicationResourceAttribute} proxy from a {@link Attribute} stereotyped << HwCommunicationResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwCommunicationResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dc53500e-5d1c-4f96-8482-0f7cdf7bca74")
    public static HwCommunicationResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwCommunicationResourceAttribute.canInstantiate(obj))
        	return new HwCommunicationResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("HwCommunicationResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("38677f5b-8eb7-4c68-9b33-49b8ffc99762")
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
        HwCommunicationResourceAttribute other = (HwCommunicationResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("4a741411-6210-4604-a78e-6cf9bfecddea")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("c530d852-423d-4826-be54-453d8e100166")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("62d1661a-855f-4cde-a798-4dc6be355027")
    protected HwCommunicationResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("fe194f04-9dea-4472-8849-dfa375efbc5e")
    public static final class MdaTypes {
        @objid ("057ba5ef-9ebd-4f58-b27b-605abf807a75")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("db8461d1-0237-4a35-aef7-af1390638ce7")
        private static Stereotype MDAASSOCDEP;

        @objid ("2c2bda97-8f4d-4f3d-b4ad-9638771520c2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d5cc3b30-d18b-401d-91f1-df21db59612d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00fea645-0ccf-11df-8525-001302895b2b");
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
