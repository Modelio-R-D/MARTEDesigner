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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_enableConcurrencyServices_SwConcurrentResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b34a63f4-6dfa-48ae-bb9d-aa69e446a642")
public class ProfileAssociationEnableConcurrencyServicesSwConcurrentResource {
    @objid ("031f2d1f-ec3a-4685-9149-2f0a601ab6c9")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_enableConcurrencyServices_SwConcurrentResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("67120b94-f4b5-48ac-9175-014175f974cd")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationEnableConcurrencyServicesSwConcurrentResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_enableConcurrencyServices_SwConcurrentResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("711972f5-bd73-44a5-a608-01e84945b7cd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationEnableConcurrencyServicesSwConcurrentResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_enableConcurrencyServices_SwConcurrentResource >> then instantiate a {@link ProfileAssociationEnableConcurrencyServicesSwConcurrentResource} proxy.
     * 
     * @return a {@link ProfileAssociationEnableConcurrencyServicesSwConcurrentResource} proxy on the created {@link Dependency}.
     */
    @objid ("e7303ace-e5e8-4228-a1de-ac7ad97c882f")
    public static ProfileAssociationEnableConcurrencyServicesSwConcurrentResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationEnableConcurrencyServicesSwConcurrentResource.STEREOTYPE_NAME);
        return ProfileAssociationEnableConcurrencyServicesSwConcurrentResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationEnableConcurrencyServicesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_enableConcurrencyServices_SwConcurrentResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationEnableConcurrencyServicesSwConcurrentResource} proxy or <i>null</i>.
     */
    @objid ("e4e6f700-cad1-49f1-8f6c-f03cd7d93cc3")
    public static ProfileAssociationEnableConcurrencyServicesSwConcurrentResource instantiate(final Dependency obj) {
        return ProfileAssociationEnableConcurrencyServicesSwConcurrentResource.canInstantiate(obj) ? new ProfileAssociationEnableConcurrencyServicesSwConcurrentResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationEnableConcurrencyServicesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_enableConcurrencyServices_SwConcurrentResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationEnableConcurrencyServicesSwConcurrentResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0162226a-b9ac-4622-ab7f-4df15d749ae2")
    public static ProfileAssociationEnableConcurrencyServicesSwConcurrentResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationEnableConcurrencyServicesSwConcurrentResource.canInstantiate(obj))
        	return new ProfileAssociationEnableConcurrencyServicesSwConcurrentResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationEnableConcurrencyServicesSwConcurrentResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e5778ef5-0ee2-4643-8f58-de4eb8cb4f89")
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
        ProfileAssociationEnableConcurrencyServicesSwConcurrentResource other = (ProfileAssociationEnableConcurrencyServicesSwConcurrentResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("0dd47a66-daf4-4e56-9453-afa1a91bdd1c")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("4755e935-01bb-4699-8287-3c66546fcc90")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("4813f528-74e2-4b9b-94b3-00b8791480cc")
    protected ProfileAssociationEnableConcurrencyServicesSwConcurrentResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("96f535c9-f8ec-4a50-85bb-35ee2fec91d0")
    public static final class MdaTypes {
        @objid ("2417aa6e-7eda-4a9b-a8c9-85fef2d6334f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b9ec21ee-5577-4e2c-950b-b190093f6bfd")
        private static Stereotype MDAASSOCDEP;

        @objid ("45658de7-e00c-41b1-b4a4-d8870d5d0913")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("af4c4269-7d38-43ce-9230-3981c215d353")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7f2fe081-9756-11e0-94fb-0027103f347c");
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
