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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_resource_PaResPassStep >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("99753c7a-373b-4dbd-8c23-db6691214dc4")
public class ProfileAssociationResourcePaResPassStep {
    @objid ("443e03ed-9946-4bd0-b13d-6b3afc82d7d7")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_resource_PaResPassStep";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("791964b9-01ee-4d14-b6dc-fbbe9aa5b355")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationResourcePaResPassStep proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_resource_PaResPassStep >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("aae1e883-d6b3-4353-90a5-ac0a8d4fc0fe")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationResourcePaResPassStep.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_resource_PaResPassStep >> then instantiate a {@link ProfileAssociationResourcePaResPassStep} proxy.
     * 
     * @return a {@link ProfileAssociationResourcePaResPassStep} proxy on the created {@link Dependency}.
     */
    @objid ("bd70ff3f-00c9-4bac-8bbe-a4a8d3acfae5")
    public static ProfileAssociationResourcePaResPassStep create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationResourcePaResPassStep.STEREOTYPE_NAME);
        return ProfileAssociationResourcePaResPassStep.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationResourcePaResPassStep} proxy from a {@link Dependency} stereotyped << ProfileAssociation_resource_PaResPassStep >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationResourcePaResPassStep} proxy or <i>null</i>.
     */
    @objid ("689ff6b0-2234-48c3-bfdb-34f4ff5ed770")
    public static ProfileAssociationResourcePaResPassStep instantiate(final Dependency obj) {
        return ProfileAssociationResourcePaResPassStep.canInstantiate(obj) ? new ProfileAssociationResourcePaResPassStep(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationResourcePaResPassStep} proxy from a {@link Dependency} stereotyped << ProfileAssociation_resource_PaResPassStep >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationResourcePaResPassStep} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("17397a54-bdad-4b85-bd55-4562de165c4c")
    public static ProfileAssociationResourcePaResPassStep safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationResourcePaResPassStep.canInstantiate(obj))
        	return new ProfileAssociationResourcePaResPassStep(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationResourcePaResPassStep: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0ae31025-7736-43f3-96ff-ba2c3e774997")
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
        ProfileAssociationResourcePaResPassStep other = (ProfileAssociationResourcePaResPassStep) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("06d63275-b63a-44d9-9525-54bcf7e8b2d0")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("a72299e7-ca72-4975-9869-1a6cb26df111")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("1bcdf625-e0ef-429d-a8a6-6503c7702d08")
    protected ProfileAssociationResourcePaResPassStep(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("d4b8e3a5-c243-4a91-8a43-1929e45189db")
    public static final class MdaTypes {
        @objid ("c5e8922e-dcdf-4453-8558-5f458bcd7d7d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("af1052a7-8e1d-4a29-a92c-afc9ba2064cf")
        private static Stereotype MDAASSOCDEP;

        @objid ("56afa5fa-dc62-42c7-a979-7933fed6aaaa")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ca213e27-37e5-4765-8f86-264296e6bb88")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d0f19a58-dd1f-11e0-a2be-0027103f347c");
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
