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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_priorityElements_SwConcurrentResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("06c1d383-978a-44a7-a6a8-dcc7d76472e7")
public class ProfileAssociationPriorityElementsSwConcurrentResource {
    @objid ("3637fbf3-2f4d-47df-a072-bb1b7e630971")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_priorityElements_SwConcurrentResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("cc1e273b-c4fc-416a-9f04-88646469bfee")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationPriorityElementsSwConcurrentResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_priorityElements_SwConcurrentResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0c666aa1-1e8e-4b24-b6db-926f38e128ec")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationPriorityElementsSwConcurrentResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_priorityElements_SwConcurrentResource >> then instantiate a {@link ProfileAssociationPriorityElementsSwConcurrentResource} proxy.
     * 
     * @return a {@link ProfileAssociationPriorityElementsSwConcurrentResource} proxy on the created {@link Dependency}.
     */
    @objid ("e6c49706-1e4e-4de1-8fea-a842a6d36f85")
    public static ProfileAssociationPriorityElementsSwConcurrentResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationPriorityElementsSwConcurrentResource.STEREOTYPE_NAME);
        return ProfileAssociationPriorityElementsSwConcurrentResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationPriorityElementsSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_priorityElements_SwConcurrentResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationPriorityElementsSwConcurrentResource} proxy or <i>null</i>.
     */
    @objid ("c66c3c1c-bcb9-46be-afcd-28c45f4ca375")
    public static ProfileAssociationPriorityElementsSwConcurrentResource instantiate(final Dependency obj) {
        return ProfileAssociationPriorityElementsSwConcurrentResource.canInstantiate(obj) ? new ProfileAssociationPriorityElementsSwConcurrentResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationPriorityElementsSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_priorityElements_SwConcurrentResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationPriorityElementsSwConcurrentResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("da1ca9cf-ba97-42d5-9706-723f24795d34")
    public static ProfileAssociationPriorityElementsSwConcurrentResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationPriorityElementsSwConcurrentResource.canInstantiate(obj))
        	return new ProfileAssociationPriorityElementsSwConcurrentResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationPriorityElementsSwConcurrentResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c953a89f-bb90-4cfd-92e5-634c80adfc88")
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
        ProfileAssociationPriorityElementsSwConcurrentResource other = (ProfileAssociationPriorityElementsSwConcurrentResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("9bbac780-f4e6-4af1-af0a-46ddf0c1685b")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("7bc69fa8-056e-490f-9ae8-60c8de958c45")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("45d012f3-ff54-4d93-a6f9-0b3eb29ff739")
    protected ProfileAssociationPriorityElementsSwConcurrentResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("0bfd0deb-c749-4251-8e06-2f34270fcf8c")
    public static final class MdaTypes {
        @objid ("ee2ddc27-e4fa-4ec7-96f0-60dcb37b46fc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("88ac86eb-726c-43f1-acf1-681a9b0e2e1c")
        private static Stereotype MDAASSOCDEP;

        @objid ("829d3644-883a-47a8-bde4-3687c8d24abf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d7278f7a-1f3b-4f48-905a-50dfe60330fb")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "45632533-9756-11e0-94fb-0027103f347c");
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
