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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_classifier_DataEvent >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("dde262ff-c6ee-4f2e-a40f-3b2c69dd20f1")
public class ProfileAssociationClassifierDataEvent {
    @objid ("4356a839-c254-4759-86ae-eab8a3c3d292")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_classifier_DataEvent";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("13a2f3e7-9e97-4e98-910d-3663cb6f5748")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationClassifierDataEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_classifier_DataEvent >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9d9167e9-1254-4060-b0b8-5cb220ea0e22")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationClassifierDataEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_classifier_DataEvent >> then instantiate a {@link ProfileAssociationClassifierDataEvent} proxy.
     * 
     * @return a {@link ProfileAssociationClassifierDataEvent} proxy on the created {@link Dependency}.
     */
    @objid ("950c5ad7-019a-43a3-89b0-3567608832ac")
    public static ProfileAssociationClassifierDataEvent create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationClassifierDataEvent.STEREOTYPE_NAME);
        return ProfileAssociationClassifierDataEvent.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationClassifierDataEvent} proxy from a {@link Dependency} stereotyped << ProfileAssociation_classifier_DataEvent >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationClassifierDataEvent} proxy or <i>null</i>.
     */
    @objid ("734ff969-7a9c-4fcb-9358-f7a26264fdf3")
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
    @objid ("fa271e3d-e77c-4eb2-b4cd-bc8b088f5d10")
    public static ProfileAssociationClassifierDataEvent safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationClassifierDataEvent.canInstantiate(obj))
        	return new ProfileAssociationClassifierDataEvent(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationClassifierDataEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2141b23f-aae5-46cb-b390-c9c3539888bc")
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
    @objid ("c212c43f-bfdb-4e94-aae2-9bec5bf31728")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("5dfd71ed-4be2-4bad-af86-f8f09aeeb674")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("648d144f-b2b4-47cf-a825-2f16921bdcfc")
    protected ProfileAssociationClassifierDataEvent(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("1eee3b17-5cd5-48c8-a404-44b46d00b876")
    public static final class MdaTypes {
        @objid ("225fcae5-9104-48a3-bf71-cd9f792239e4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d6d41848-7f63-4449-8563-3274f2a041cc")
        private static Stereotype MDAASSOCDEP;

        @objid ("5f036ed6-2d8f-40d1-bcc3-29adf6834700")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9a0534d7-dbcd-402f-b8d7-f6b71c663c34")
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
