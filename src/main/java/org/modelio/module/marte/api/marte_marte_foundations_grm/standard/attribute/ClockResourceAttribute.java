/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute;

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
 * Proxy class to handle a {@link Attribute} with << ClockResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ddbb6cbc-2a08-4249-a3cc-4e8ce605ad1c")
public class ClockResourceAttribute extends TimingResourceAttribute {
    @objid ("73de7cbf-168c-4085-97fa-6847831c3a00")
    public static final String STEREOTYPE_NAME = "ClockResource_Attribute";

    /**
     * Tells whether a {@link ClockResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << ClockResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6d0a44fa-7cd9-4b40-b3e0-899738c8418e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << ClockResource_Attribute >> then instantiate a {@link ClockResourceAttribute} proxy.
     * 
     * @return a {@link ClockResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("28b03331-9051-4472-a20d-9f44d080d620")
    public static ClockResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockResourceAttribute.STEREOTYPE_NAME);
        return ClockResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link ClockResourceAttribute} proxy from a {@link Attribute} stereotyped << ClockResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link ClockResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("cf1aae11-4f88-4d5b-a544-c814fad415f8")
    public static ClockResourceAttribute instantiate(final Attribute obj) {
        return ClockResourceAttribute.canInstantiate(obj) ? new ClockResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClockResourceAttribute} proxy from a {@link Attribute} stereotyped << ClockResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link ClockResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3623a419-4729-4161-98d2-28ce60056c27")
    public static ClockResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (ClockResourceAttribute.canInstantiate(obj))
        	return new ClockResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("ClockResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("af6bf580-c1e0-4f04-8f9a-19363eae2a97")
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
        ClockResourceAttribute other = (ClockResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("5e4fdb0e-b9ee-4b92-9014-60f181d1851b")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("d0cbb016-077e-4b02-8648-c3bef00053ba")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e3a52cc8-67dc-479c-b489-48abea1a04f9")
    protected ClockResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("7eb14cdc-a64c-4f91-8720-cacbe115efa0")
    public static final class MdaTypes {
        @objid ("436d8596-c20d-49ce-9645-538d58056db9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b1c7839a-23cb-46b9-9f8f-2f18dc509b2d")
        private static Stereotype MDAASSOCDEP;

        @objid ("bfbeb48f-7992-457c-b298-ca0947a7db7f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6e7f63e7-3481-42f3-819a-b79a21d810e5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "009f4974-0ccf-11df-8525-001302895b2b");
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
