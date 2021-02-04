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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_onFeature_GCMInvocatingBehavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("da063d13-5350-44f6-ae23-38fca3962cd2")
public class ProfileAssociationOnFeatureGCMInvocatingBehavior {
    @objid ("ff3e14fc-602a-4970-9194-ae1e2f5d135f")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_onFeature_GCMInvocatingBehavior";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("949a929f-91e0-4a7a-83e4-2d3c5c5cf5b0")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationOnFeatureGCMInvocatingBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_onFeature_GCMInvocatingBehavior >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("80abf980-07e9-4ae1-8656-7e7b5ea175d3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOnFeatureGCMInvocatingBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_onFeature_GCMInvocatingBehavior >> then instantiate a {@link ProfileAssociationOnFeatureGCMInvocatingBehavior} proxy.
     * 
     * @return a {@link ProfileAssociationOnFeatureGCMInvocatingBehavior} proxy on the created {@link Dependency}.
     */
    @objid ("fa7e9915-dc41-4c02-8dff-d64493c84f1a")
    public static ProfileAssociationOnFeatureGCMInvocatingBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOnFeatureGCMInvocatingBehavior.STEREOTYPE_NAME);
        return ProfileAssociationOnFeatureGCMInvocatingBehavior.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOnFeatureGCMInvocatingBehavior} proxy from a {@link Dependency} stereotyped << ProfileAssociation_onFeature_GCMInvocatingBehavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationOnFeatureGCMInvocatingBehavior} proxy or <i>null</i>.
     */
    @objid ("1e367670-8082-4e80-a60e-cc787b51a86e")
    public static ProfileAssociationOnFeatureGCMInvocatingBehavior instantiate(final Dependency obj) {
        return ProfileAssociationOnFeatureGCMInvocatingBehavior.canInstantiate(obj) ? new ProfileAssociationOnFeatureGCMInvocatingBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOnFeatureGCMInvocatingBehavior} proxy from a {@link Dependency} stereotyped << ProfileAssociation_onFeature_GCMInvocatingBehavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationOnFeatureGCMInvocatingBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1632331c-bd13-4be4-a065-08bf6da6617e")
    public static ProfileAssociationOnFeatureGCMInvocatingBehavior safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationOnFeatureGCMInvocatingBehavior.canInstantiate(obj))
        	return new ProfileAssociationOnFeatureGCMInvocatingBehavior(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationOnFeatureGCMInvocatingBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("03ce832e-bd50-4cc1-be64-640abc0b792e")
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
        ProfileAssociationOnFeatureGCMInvocatingBehavior other = (ProfileAssociationOnFeatureGCMInvocatingBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("b8350f6c-4077-46dc-9d73-6a74237be84f")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("809307b7-4351-4cd7-a320-8e20fd1029d6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("56068971-3b0d-451d-946d-3c1832821bf9")
    protected ProfileAssociationOnFeatureGCMInvocatingBehavior(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("34445631-caf0-44fa-a270-c54a248254a4")
    public static final class MdaTypes {
        @objid ("66d7ad84-7a70-4168-b93f-681b81555ed2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e7893de2-b79d-4602-b066-9177057681f8")
        private static Stereotype MDAASSOCDEP;

        @objid ("713bed78-dff2-40bb-a037-44860ca2409e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7edfb3bf-a0e2-4348-af4b-8726fb234fd8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "861093f4-9a74-11e1-a5f6-0027103f347d");
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
