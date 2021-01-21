/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("15bb63d4-2a92-49a3-a8d8-0f0ac72d98a3")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_onFeature_GCMInvocatingBehavior";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("c74cca00-edb1-4cd5-9060-9ceab675efe2")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationOnFeatureGCMInvocatingBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_onFeature_GCMInvocatingBehavior >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ad9c92d1-48f9-4767-9a62-b3cfd81cd78b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOnFeatureGCMInvocatingBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_onFeature_GCMInvocatingBehavior >> then instantiate a {@link ProfileAssociationOnFeatureGCMInvocatingBehavior} proxy.
     * 
     * @return a {@link ProfileAssociationOnFeatureGCMInvocatingBehavior} proxy on the created {@link Dependency}.
     */
    @objid ("1a81ace8-8181-486f-9618-e0089857b0f9")
    public static ProfileAssociationOnFeatureGCMInvocatingBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOnFeatureGCMInvocatingBehavior.STEREOTYPE_NAME);
        return ProfileAssociationOnFeatureGCMInvocatingBehavior.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOnFeatureGCMInvocatingBehavior} proxy from a {@link Dependency} stereotyped << ProfileAssociation_onFeature_GCMInvocatingBehavior >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationOnFeatureGCMInvocatingBehavior} proxy or <i>null</i>.
     */
    @objid ("5a9b1bc0-56f3-4ed3-9cb3-f82b4022043c")
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
    @objid ("07a81fde-3a71-486a-ad7e-9f28ef141b53")
    public static ProfileAssociationOnFeatureGCMInvocatingBehavior safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationOnFeatureGCMInvocatingBehavior.canInstantiate(obj))
        	return new ProfileAssociationOnFeatureGCMInvocatingBehavior(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationOnFeatureGCMInvocatingBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b5b7e4f8-e30c-43d1-8cb0-32b4f17d986c")
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
    @objid ("01fdecec-51aa-4f98-a8b4-2784b2cc9cc9")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("cc1b6aa6-4e8d-404e-afa8-2dd9f64fe0b8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c23a2dcc-9e9b-4930-9aff-24592edbbd74")
    protected ProfileAssociationOnFeatureGCMInvocatingBehavior(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("34445631-caf0-44fa-a270-c54a248254a4")
    public static final class MdaTypes {
        @objid ("19b5db42-477a-4936-8781-fd3d9eed9322")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("54f7d38a-0753-46b7-9df6-937b8a538c7f")
        private static Stereotype MDAASSOCDEP;

        @objid ("7f41a422-0f5d-4344-b580-da2bf190471c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7f3a20e0-cf72-494e-b3fd-8c60e66764a4")
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
