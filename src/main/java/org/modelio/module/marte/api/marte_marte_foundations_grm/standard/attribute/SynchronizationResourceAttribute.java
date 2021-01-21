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
 * Proxy class to handle a {@link Attribute} with << SynchronizationResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e73a49f8-e8f7-4f2b-ad9d-5c16a7f51522")
public class SynchronizationResourceAttribute extends ResourceAttribute {
    @objid ("7db5861d-8b25-4aaf-9dbe-c903af04832f")
    public static final String STEREOTYPE_NAME = "SynchronizationResource_Attribute";

    /**
     * Tells whether a {@link SynchronizationResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SynchronizationResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1082c3a7-f89e-4602-8584-7381958846ac")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SynchronizationResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SynchronizationResource_Attribute >> then instantiate a {@link SynchronizationResourceAttribute} proxy.
     * 
     * @return a {@link SynchronizationResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("0b6ff0c8-fbf3-4d78-b3f7-2ae5241beea0")
    public static SynchronizationResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SynchronizationResourceAttribute.STEREOTYPE_NAME);
        return SynchronizationResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SynchronizationResourceAttribute} proxy from a {@link Attribute} stereotyped << SynchronizationResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SynchronizationResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("ded23529-281c-4ad3-bee0-bbf4ef436c14")
    public static SynchronizationResourceAttribute instantiate(final Attribute obj) {
        return SynchronizationResourceAttribute.canInstantiate(obj) ? new SynchronizationResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SynchronizationResourceAttribute} proxy from a {@link Attribute} stereotyped << SynchronizationResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SynchronizationResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("de0d5887-3d04-43ac-b107-40c296d651f7")
    public static SynchronizationResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SynchronizationResourceAttribute.canInstantiate(obj))
        	return new SynchronizationResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SynchronizationResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1d090f58-a3a8-450b-bffe-641916532c6e")
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
        SynchronizationResourceAttribute other = (SynchronizationResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("b29e30b9-72d9-415c-9900-d0ffb34d59c1")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("845216d2-d23c-4e64-bd38-f26f4450d374")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("50b9d340-7054-40ed-a29c-be5ecb672d8b")
    protected SynchronizationResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("28a67bea-e29c-4297-9d51-a4c773e8d6b3")
    public static final class MdaTypes {
        @objid ("b9a37f90-da28-463b-bf54-1741ed0dbaa1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7d5f676b-5a58-42ea-aa06-fc9b609fac50")
        private static Stereotype MDAASSOCDEP;

        @objid ("847c604e-b09e-4e79-a6a7-8668636f979d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("19336fc0-e888-4043-a7ac-8b7f1067d344")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ffa75824-0cce-11df-8525-001302895b2b");
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
