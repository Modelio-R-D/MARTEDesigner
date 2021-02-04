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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_invocations_GCMInvocatingBehavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d158b1d9-aa22-48cf-b752-d14cb7ade881")
public class ProfileAssociationInvocationsGCMInvocatingBehavior {
    @objid ("074e7acb-0ee6-47cd-892c-60d11e8e6246")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_invocations_GCMInvocatingBehavior";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("4ac9a484-fe95-4fd0-9619-fa30b71e77b7")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationInvocationsGCMInvocatingBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_invocations_GCMInvocatingBehavior >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5e3dae47-26ac-4b3d-9b69-6681138443f8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationInvocationsGCMInvocatingBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_invocations_GCMInvocatingBehavior >> then instantiate a {@link ProfileAssociationInvocationsGCMInvocatingBehavior} proxy.
     * 
     * @return a {@link ProfileAssociationInvocationsGCMInvocatingBehavior} proxy on the created {@link Dependency}.
     */
    @objid ("91f16fd5-3c54-48e3-95ae-e3eb661802a1")
    public static ProfileAssociationInvocationsGCMInvocatingBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationInvocationsGCMInvocatingBehavior.STEREOTYPE_NAME);
        return ProfileAssociationInvocationsGCMInvocatingBehavior.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationInvocationsGCMInvocatingBehavior} proxy from a {@link Dependency} stereotyped << ProfileAssociation_invocations_GCMInvocatingBehavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationInvocationsGCMInvocatingBehavior} proxy or <i>null</i>.
     */
    @objid ("71166ea4-47d7-4234-87f8-57cba070ab7d")
    public static ProfileAssociationInvocationsGCMInvocatingBehavior instantiate(final Dependency obj) {
        return ProfileAssociationInvocationsGCMInvocatingBehavior.canInstantiate(obj) ? new ProfileAssociationInvocationsGCMInvocatingBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationInvocationsGCMInvocatingBehavior} proxy from a {@link Dependency} stereotyped << ProfileAssociation_invocations_GCMInvocatingBehavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationInvocationsGCMInvocatingBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1f3514eb-b7cc-4fcc-8b89-32d760f595d9")
    public static ProfileAssociationInvocationsGCMInvocatingBehavior safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationInvocationsGCMInvocatingBehavior.canInstantiate(obj))
        	return new ProfileAssociationInvocationsGCMInvocatingBehavior(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationInvocationsGCMInvocatingBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("17eacbb1-4def-42f8-ba48-c69f754b5190")
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
        ProfileAssociationInvocationsGCMInvocatingBehavior other = (ProfileAssociationInvocationsGCMInvocatingBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("c01375a6-cbdf-4c5e-b69f-45a88c3ba43e")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("779fb979-7e82-41ab-bd14-1a47e08d882a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("cfe4ffb1-0749-47ba-974a-2b65dc92f709")
    protected ProfileAssociationInvocationsGCMInvocatingBehavior(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("f5a67ee9-4913-43ee-9aa7-531143ffc1e6")
    public static final class MdaTypes {
        @objid ("7f3b90e5-9329-4094-86a2-8b2786a37adf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("41ec11a4-b82a-49f2-ab68-930525099ab0")
        private static Stereotype MDAASSOCDEP;

        @objid ("9fb941e6-b26b-450d-8411-6bc744e49b83")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6960c42a-3b7e-4dc9-8b21-0005e79f4cd4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c283f7e3-a32a-11e1-8263-0027103f347d");
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
