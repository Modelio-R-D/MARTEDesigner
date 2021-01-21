/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.actor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
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
 * Proxy class to handle a {@link Actor} with << PpUnit_Actor >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("816b995e-6f38-40af-b927-d33f92d768e1")
public class PpUnitActor {
    @objid ("1b93b6d4-e307-4d28-b0d6-48da98cb931d")
    public static final String STEREOTYPE_NAME = "PpUnit_Actor";

    @objid ("f6136959-0145-415f-932c-cd768da9cc15")
    public static final String PPUNIT_ACTOR_CONCPOLICY_TAGTYPE = "PpUnit_Actor_concPolicy";

    @objid ("19c3c35c-a7ba-4a6e-91a7-e7b3573a603e")
    public static final String PPUNIT_ACTOR_MEMORYSIZE_TAGTYPE = "PpUnit_Actor_memorySize";

    /**
     * The underlying {@link Actor} represented by this proxy, never null.
     */
    @objid ("c9fe294a-3d10-4389-aefa-c9afcd445556")
    protected final Actor elt;

    /**
     * Tells whether a {@link PpUnitActor proxy} can be instantiated from a {@link MObject} checking it is a {@link Actor} stereotyped << PpUnit_Actor >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("85d410cd-bd6c-48c9-82ba-c550911fb92b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Actor) && ((Actor) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PpUnitActor.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Actor} stereotyped << PpUnit_Actor >> then instantiate a {@link PpUnitActor} proxy.
     * 
     * @return a {@link PpUnitActor} proxy on the created {@link Actor}.
     */
    @objid ("c0f6928f-b5df-433a-a3a1-69e882d294b0")
    public static PpUnitActor create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Actor");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PpUnitActor.STEREOTYPE_NAME);
        return PpUnitActor.instantiate((Actor)e);
    }

    /**
     * Tries to instantiate a {@link PpUnitActor} proxy from a {@link Actor} stereotyped << PpUnit_Actor >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Actor
     * @return a {@link PpUnitActor} proxy or <i>null</i>.
     */
    @objid ("c19c6949-68d6-4408-b095-9c187d226e34")
    public static PpUnitActor instantiate(final Actor obj) {
        return PpUnitActor.canInstantiate(obj) ? new PpUnitActor(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PpUnitActor} proxy from a {@link Actor} stereotyped << PpUnit_Actor >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Actor}
     * @return a {@link PpUnitActor} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f92eb8d6-1f90-4c94-a942-bb2fe9eb73a8")
    public static PpUnitActor safeInstantiate(final Actor obj) throws IllegalArgumentException {
        if (PpUnitActor.canInstantiate(obj))
        	return new PpUnitActor(obj);
        else
        	throw new IllegalArgumentException("PpUnitActor: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("63f123e4-9cfa-4255-9ff6-d6a2b1ea7a69")
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
        PpUnitActor other = (PpUnitActor) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Actor}. 
     * @return the Actor represented by this proxy, never null.
     */
    @objid ("bf251f28-bbcf-499d-8d88-5d78b51b057d")
    public Actor getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'PpUnit_Actor_concPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("27dae8c6-9aef-4cd5-b611-4687dda4149d")
    public String getPpUnit_Actor_concPolicy() {
        return this.elt.getTagValue(PpUnitActor.MdaTypes.PPUNIT_ACTOR_CONCPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PpUnit_Actor_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2cd791f5-7901-46ba-8cd7-a39437de9fcc")
    public String getPpUnit_Actor_memorySize() {
        return this.elt.getTagValue(PpUnitActor.MdaTypes.PPUNIT_ACTOR_MEMORYSIZE_TAGTYPE_ELT);
    }

    @objid ("fcaddb80-82c9-40a4-ad0c-7f363ca6fa3c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PpUnit_Actor_concPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("16c39454-ae79-4d52-b205-cc5d5f9b2a01")
    public void setPpUnit_Actor_concPolicy(final String value) {
        this.elt.putTagValue(PpUnitActor.MdaTypes.PPUNIT_ACTOR_CONCPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PpUnit_Actor_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3a3c3a65-5c90-4fa5-bbaa-edd1d750922d")
    public void setPpUnit_Actor_memorySize(final String value) {
        this.elt.putTagValue(PpUnitActor.MdaTypes.PPUNIT_ACTOR_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    @objid ("67bcf3bf-231f-411c-9717-d8894019f836")
    protected PpUnitActor(final Actor elt) {
        this.elt = elt;
    }

    @objid ("4c185900-a581-48b7-8ec3-059b195242e6")
    public static final class MdaTypes {
        @objid ("8ac6a2b9-6e53-48b6-8f41-368130156c1a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("14dcdb9c-900e-4b7e-88b1-9946c22efa18")
        public static TagType PPUNIT_ACTOR_CONCPOLICY_TAGTYPE_ELT;

        @objid ("bb688e0c-faca-4742-afeb-17c1bbc59668")
        public static TagType PPUNIT_ACTOR_MEMORYSIZE_TAGTYPE_ELT;

        @objid ("860b832a-1ef1-4f56-b4eb-e1d35d07250d")
        private static Stereotype MDAASSOCDEP;

        @objid ("08c7fa2b-faa0-4f7f-a40a-5a75c6bb0781")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ff805e11-3042-475b-afa5-0fbd53954cb4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00c56ea8-0ccf-11df-8525-001302895b2b");
            PPUNIT_ACTOR_CONCPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00c56ea9-0ccf-11df-8525-001302895b2b");
            PPUNIT_ACTOR_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00c56eaa-0ccf-11df-8525-001302895b2b");
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
