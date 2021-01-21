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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_mode_NfpConstraint_Mode >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("62431ae5-4822-4be9-8de1-85ef0533582e")
public class ProfileAssociationModeNfpConstraintMode {
    @objid ("9b5a3d00-eabf-4d44-bed2-9614c0c08bc2")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_mode_NfpConstraint_Mode";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("f98a2b3a-8abd-40a5-85b8-b32ca3b78bbd")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationModeNfpConstraintMode proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_mode_NfpConstraint_Mode >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9d5865b1-d114-47d1-9b7a-2c8b46d3c339")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationModeNfpConstraintMode.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_mode_NfpConstraint_Mode >> then instantiate a {@link ProfileAssociationModeNfpConstraintMode} proxy.
     * 
     * @return a {@link ProfileAssociationModeNfpConstraintMode} proxy on the created {@link Dependency}.
     */
    @objid ("bb84c740-3a04-4813-9cff-33cf5387d563")
    public static ProfileAssociationModeNfpConstraintMode create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationModeNfpConstraintMode.STEREOTYPE_NAME);
        return ProfileAssociationModeNfpConstraintMode.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationModeNfpConstraintMode} proxy from a {@link Dependency} stereotyped << ProfileAssociation_mode_NfpConstraint_Mode >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Dependency
     * @return a {@link ProfileAssociationModeNfpConstraintMode} proxy or <i>null</i>.
     */
    @objid ("7a925f7a-1369-485c-9804-89cbccf4eadf")
    public static ProfileAssociationModeNfpConstraintMode instantiate(final Dependency obj) {
        return ProfileAssociationModeNfpConstraintMode.canInstantiate(obj) ? new ProfileAssociationModeNfpConstraintMode(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationModeNfpConstraintMode} proxy from a {@link Dependency} stereotyped << ProfileAssociation_mode_NfpConstraint_Mode >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationModeNfpConstraintMode} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7d065730-0eac-400d-b1ca-9143e9938db9")
    public static ProfileAssociationModeNfpConstraintMode safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationModeNfpConstraintMode.canInstantiate(obj))
            return new ProfileAssociationModeNfpConstraintMode(obj);
        else
            throw new IllegalArgumentException("ProfileAssociationModeNfpConstraintMode: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("70f5464f-4681-4bc6-a9ff-503724f615de")
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
        ProfileAssociationModeNfpConstraintMode other = (ProfileAssociationModeNfpConstraintMode) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}.
     * 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("879146b2-4ae2-497c-9e19-b763c4adccf2")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("2038c040-8064-4bd4-844e-f9583f61dccf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ee3edb67-f047-44ba-a807-7842de419f67")
    protected ProfileAssociationModeNfpConstraintMode(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("a3c9abb7-655c-42bb-9b41-5832a7b40536")
    public static final class MdaTypes {
        @objid ("50c07d80-57f7-4b05-9727-52b0ed44011b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f1a2cc89-9fad-4ba2-93e9-e02a3cfcdfe7")
        private static Stereotype MDAASSOCDEP;

        @objid ("c9673be9-821c-4821-ad47-ed4fe40d8b92")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6432965f-08e5-4ed3-881d-e3ef5c838840")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ad6dd368-7ddd-11df-9e39-0014222a9f79");
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
