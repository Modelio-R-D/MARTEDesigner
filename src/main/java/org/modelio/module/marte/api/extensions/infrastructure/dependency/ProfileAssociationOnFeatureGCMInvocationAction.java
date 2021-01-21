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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_onFeature_GCMInvocationAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("2a88ffed-b06a-4dcf-815f-b4b9091a161a")
public class ProfileAssociationOnFeatureGCMInvocationAction {
    @objid ("ce344286-7665-4819-b2b6-60eb77618cf0")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_onFeature_GCMInvocationAction";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("274bb318-dc5c-4866-ae92-3b4d507ffaa4")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationOnFeatureGCMInvocationAction proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_onFeature_GCMInvocationAction >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8437face-96b9-4f7c-8cf0-3bcf0191d55b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOnFeatureGCMInvocationAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_onFeature_GCMInvocationAction >> then instantiate a {@link ProfileAssociationOnFeatureGCMInvocationAction} proxy.
     * 
     * @return a {@link ProfileAssociationOnFeatureGCMInvocationAction} proxy on the created {@link Dependency}.
     */
    @objid ("52d5d586-fd16-4e83-8afd-cf14ddb272a5")
    public static ProfileAssociationOnFeatureGCMInvocationAction create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOnFeatureGCMInvocationAction.STEREOTYPE_NAME);
        return ProfileAssociationOnFeatureGCMInvocationAction.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOnFeatureGCMInvocationAction} proxy from a {@link Dependency} stereotyped << ProfileAssociation_onFeature_GCMInvocationAction >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationOnFeatureGCMInvocationAction} proxy or <i>null</i>.
     */
    @objid ("6d2ccd68-d030-43cd-9f12-ac898a8bea47")
    public static ProfileAssociationOnFeatureGCMInvocationAction instantiate(final Dependency obj) {
        return ProfileAssociationOnFeatureGCMInvocationAction.canInstantiate(obj) ? new ProfileAssociationOnFeatureGCMInvocationAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOnFeatureGCMInvocationAction} proxy from a {@link Dependency} stereotyped << ProfileAssociation_onFeature_GCMInvocationAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationOnFeatureGCMInvocationAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ace4c938-6d45-4c9b-9d4a-451842792135")
    public static ProfileAssociationOnFeatureGCMInvocationAction safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationOnFeatureGCMInvocationAction.canInstantiate(obj))
        	return new ProfileAssociationOnFeatureGCMInvocationAction(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationOnFeatureGCMInvocationAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7e4316bc-d8ca-4d85-98b6-1ab1b1d3abfd")
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
        ProfileAssociationOnFeatureGCMInvocationAction other = (ProfileAssociationOnFeatureGCMInvocationAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("569aef1c-fe2b-444c-906a-58643bd93295")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("4d88b864-8821-4b03-ada6-f065bec057a7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("30832d68-f53d-40a3-84e0-c9ccdc509011")
    protected ProfileAssociationOnFeatureGCMInvocationAction(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("d793ba7e-a5b6-4146-ba62-daaf877d61eb")
    public static final class MdaTypes {
        @objid ("5b4355f4-479d-4ab4-a82c-d88db8830bac")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bc3c8748-72c7-4b2c-a349-d73d9f75d71d")
        private static Stereotype MDAASSOCDEP;

        @objid ("5afd2359-6c9b-412a-a8ac-fa80fc80db60")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2304ee4b-c3ae-4d57-bb99-dd59d4eb8649")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "493c6c73-98be-11e0-aed9-0027103f347c");
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
