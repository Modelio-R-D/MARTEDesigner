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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_classifier_DataEvent >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("dde262ff-c6ee-4f2e-a40f-3b2c69dd20f1")
public class ProfileAssociationClassifierDataEvent {
    @objid ("c6bf2c9c-923c-42e4-9d26-2321c8ee21cb")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_classifier_DataEvent";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("83712a00-9281-4ad1-8efa-e8991b83b696")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationClassifierDataEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_classifier_DataEvent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("63db36d0-ea32-4bb6-9ec3-3ce43a917949")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationClassifierDataEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_classifier_DataEvent >> then instantiate a {@link ProfileAssociationClassifierDataEvent} proxy.
     * 
     * @return a {@link ProfileAssociationClassifierDataEvent} proxy on the created {@link Dependency}.
     */
    @objid ("3dfba4ea-4635-4eb2-9af5-687d8b1b22a7")
    public static ProfileAssociationClassifierDataEvent create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationClassifierDataEvent.STEREOTYPE_NAME);
        return ProfileAssociationClassifierDataEvent.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationClassifierDataEvent} proxy from a {@link Dependency} stereotyped << ProfileAssociation_classifier_DataEvent >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationClassifierDataEvent} proxy or <i>null</i>.
     */
    @objid ("4dff6e2b-e791-4a24-8161-ece1df1a7949")
    public static ProfileAssociationClassifierDataEvent instantiate(final Dependency obj) {
        return ProfileAssociationClassifierDataEvent.canInstantiate(obj) ? new ProfileAssociationClassifierDataEvent(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationClassifierDataEvent} proxy from a {@link Dependency} stereotyped << ProfileAssociation_classifier_DataEvent >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationClassifierDataEvent} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c13e8040-e0fc-4dc8-8215-32ccb6ee7442")
    public static ProfileAssociationClassifierDataEvent safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationClassifierDataEvent.canInstantiate(obj))
        	return new ProfileAssociationClassifierDataEvent(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationClassifierDataEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f2190ec0-de11-40f1-a562-e30e9c9ed07a")
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
        ProfileAssociationClassifierDataEvent other = (ProfileAssociationClassifierDataEvent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("9ccfb745-1dcf-4264-b0c1-cbe6cdb1b221")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("72e79030-ac89-46a3-8b6a-b18fe9b79ab9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("2c444516-d952-4596-96a1-e82f3a4294c1")
    protected ProfileAssociationClassifierDataEvent(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("1eee3b17-5cd5-48c8-a404-44b46d00b876")
    public static final class MdaTypes {
        @objid ("ba67dc9d-8b0e-4342-8247-72b2967faff4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1b836d5d-3fd8-45c6-9ee7-8cd9734b88aa")
        private static Stereotype MDAASSOCDEP;

        @objid ("3c366765-7e39-479c-864b-6c32580719b5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9f0c490f-503b-4745-8586-7da32447064a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "004ec674-98c1-11e0-aed9-0027103f347c");
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
