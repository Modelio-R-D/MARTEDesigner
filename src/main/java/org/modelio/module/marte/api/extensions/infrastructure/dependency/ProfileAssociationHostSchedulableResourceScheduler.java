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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_host_SchedulableResource_Scheduler >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("fbc9ebbf-b114-4c5b-b85d-6f6383434979")
public class ProfileAssociationHostSchedulableResourceScheduler {
    @objid ("f8d65b94-0534-4b06-842e-62251b18ff7e")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_host_SchedulableResource_Scheduler";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("78a4f9cc-853f-4429-b098-547bfbf04fbe")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationHostSchedulableResourceScheduler proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_host_SchedulableResource_Scheduler >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("287a5270-82eb-4c48-9078-ee59b575da4f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationHostSchedulableResourceScheduler.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_host_SchedulableResource_Scheduler >> then instantiate a {@link ProfileAssociationHostSchedulableResourceScheduler} proxy.
     * 
     * @return a {@link ProfileAssociationHostSchedulableResourceScheduler} proxy on the created {@link Dependency}.
     */
    @objid ("2d5f80de-916e-4e02-a141-8eb6dc08c100")
    public static ProfileAssociationHostSchedulableResourceScheduler create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationHostSchedulableResourceScheduler.STEREOTYPE_NAME);
        return ProfileAssociationHostSchedulableResourceScheduler.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationHostSchedulableResourceScheduler} proxy from a {@link Dependency} stereotyped << ProfileAssociation_host_SchedulableResource_Scheduler >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationHostSchedulableResourceScheduler} proxy or <i>null</i>.
     */
    @objid ("52bcb200-3dee-45d7-bdf6-4d5e5caffb6f")
    public static ProfileAssociationHostSchedulableResourceScheduler instantiate(final Dependency obj) {
        return ProfileAssociationHostSchedulableResourceScheduler.canInstantiate(obj) ? new ProfileAssociationHostSchedulableResourceScheduler(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationHostSchedulableResourceScheduler} proxy from a {@link Dependency} stereotyped << ProfileAssociation_host_SchedulableResource_Scheduler >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationHostSchedulableResourceScheduler} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3db8ec10-73f6-4744-9807-6b45905681fe")
    public static ProfileAssociationHostSchedulableResourceScheduler safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationHostSchedulableResourceScheduler.canInstantiate(obj))
        	return new ProfileAssociationHostSchedulableResourceScheduler(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationHostSchedulableResourceScheduler: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5d6a70e8-885b-4df9-84f9-850e0fac1c09")
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
        ProfileAssociationHostSchedulableResourceScheduler other = (ProfileAssociationHostSchedulableResourceScheduler) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("b574eb49-3218-43b0-b180-b75656ffd1e9")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("2c7dcce4-c0a6-43ca-945b-3d00356e2928")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("6ad7382d-a749-43fb-8ef1-0557b661ebb3")
    protected ProfileAssociationHostSchedulableResourceScheduler(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("0a6b281e-8e72-49c1-afdb-ce69461cadcd")
    public static final class MdaTypes {
        @objid ("75c48b3a-b075-42b2-a6c8-6e144bf76b22")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("510a3161-88c4-488a-a74b-9582921c6980")
        private static Stereotype MDAASSOCDEP;

        @objid ("d8b00d51-b70c-4882-858e-c355108d7cf6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("921b76b2-14c3-4be3-b66e-c05696d1eebe")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "682b49d4-8b68-11df-9343-0014222a9f79");
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
