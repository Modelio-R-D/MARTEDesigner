/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.extensions.infrastructure.dependency;

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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_intervalAttrib_IntervalType_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8135a05d-90f0-4b3d-9caf-a5d28c8fa0c9")
public class ProfileAssociationIntervalAttribIntervalTypeAttribute {
    @objid ("9fec205a-7b8e-4317-b642-198bd8eaa316")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_intervalAttrib_IntervalType_Attribute";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("cee1ab53-f737-4753-997f-0063f95439c0")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationIntervalAttribIntervalTypeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_intervalAttrib_IntervalType_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1b1803d0-d114-4795-9925-fb5db88ddf45")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationIntervalAttribIntervalTypeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_intervalAttrib_IntervalType_Attribute >> then instantiate a {@link ProfileAssociationIntervalAttribIntervalTypeAttribute} proxy.
     * 
     * @return a {@link ProfileAssociationIntervalAttribIntervalTypeAttribute} proxy on the created {@link Dependency}.
     */
    @objid ("b59dfadc-bb30-4465-b39a-aafc4e1178a8")
    public static ProfileAssociationIntervalAttribIntervalTypeAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationIntervalAttribIntervalTypeAttribute.STEREOTYPE_NAME);
        return ProfileAssociationIntervalAttribIntervalTypeAttribute.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationIntervalAttribIntervalTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_intervalAttrib_IntervalType_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationIntervalAttribIntervalTypeAttribute} proxy or <i>null</i>.
     */
    @objid ("992c9de8-ec60-4e7b-99b7-5a1eb87b6547")
    public static ProfileAssociationIntervalAttribIntervalTypeAttribute instantiate(final Dependency obj) {
        return ProfileAssociationIntervalAttribIntervalTypeAttribute.canInstantiate(obj) ? new ProfileAssociationIntervalAttribIntervalTypeAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationIntervalAttribIntervalTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_intervalAttrib_IntervalType_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationIntervalAttribIntervalTypeAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9243ba97-8536-496a-96f6-bf45ac7f8942")
    public static ProfileAssociationIntervalAttribIntervalTypeAttribute safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationIntervalAttribIntervalTypeAttribute.canInstantiate(obj))
        	return new ProfileAssociationIntervalAttribIntervalTypeAttribute(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationIntervalAttribIntervalTypeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("61e10e1c-b024-4eb3-9c36-0a6e78dc7e05")
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
        ProfileAssociationIntervalAttribIntervalTypeAttribute other = (ProfileAssociationIntervalAttribIntervalTypeAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("95ba7375-c5a8-455e-8862-0c177cb3ea3c")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("18005382-5626-4dfe-bb29-9261771199ac")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("00eecc71-5cea-4e96-b818-4c4e25f87aaf")
    protected ProfileAssociationIntervalAttribIntervalTypeAttribute(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("bc5cca33-b2b8-4070-98ee-edf6c659f39f")
    public static final class MdaTypes {
        @objid ("7347217a-3d16-49fd-ba78-e8a404bba29e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bff3ff4e-7adb-4d5b-b814-7c9a475659c6")
        private static Stereotype MDAASSOCDEP;

        @objid ("6dd55faf-4a85-4bfa-8ce4-27745d73911c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("54666fb5-08f9-4007-b5eb-5990c1ac7820")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "acddc7c0-82b2-11df-b65a-0014222a9f79");
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
