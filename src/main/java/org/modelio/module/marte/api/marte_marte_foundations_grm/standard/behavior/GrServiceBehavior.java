/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.behavior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
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
 * Proxy class to handle a {@link Behavior} with << GrService_Behavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8dd9156a-51dd-420d-ada7-c27dd6b96760")
public class GrServiceBehavior {
    @objid ("ef33e953-53bd-4f5b-84bb-cf022571b5fa")
    public static final String STEREOTYPE_NAME = "GrService_Behavior";

    @objid ("00238e2d-ce65-451d-8082-eb33d0e76687")
    public static final String GRSERVICE_BEHAVIOR_OWNER_TAGTYPE = "GrService_Behavior_owner";

    /**
     * The underlying {@link Behavior} represented by this proxy, never null.
     */
    @objid ("38ed2198-4848-40f2-9bfe-dda9c1ffcde2")
    protected final Behavior elt;

    /**
     * Tells whether a {@link GrServiceBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << GrService_Behavior >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("72571d2b-2381-4103-98ad-bed9dd8a6178")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GrServiceBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << GrService_Behavior >> then instantiate a {@link GrServiceBehavior} proxy.
     * 
     * @return a {@link GrServiceBehavior} proxy on the created {@link Behavior}.
     */
    @objid ("fcf511e2-4f7b-4a50-a58e-39f50e082d02")
    public static GrServiceBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Behavior");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GrServiceBehavior.STEREOTYPE_NAME);
        return GrServiceBehavior.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link GrServiceBehavior} proxy from a {@link Behavior} stereotyped << GrService_Behavior >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link GrServiceBehavior} proxy or <i>null</i>.
     */
    @objid ("6194507b-3458-4949-bc62-e833ece1d665")
    public static GrServiceBehavior instantiate(final Behavior obj) {
        return GrServiceBehavior.canInstantiate(obj) ? new GrServiceBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GrServiceBehavior} proxy from a {@link Behavior} stereotyped << GrService_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Behavior}
     * @return a {@link GrServiceBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f4ffc1cd-ce23-4330-9c4f-bdba0ee5235a")
    public static GrServiceBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (GrServiceBehavior.canInstantiate(obj))
        	return new GrServiceBehavior(obj);
        else
        	throw new IllegalArgumentException("GrServiceBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("77bb5582-f11c-4de0-ab7d-236641f9bb8f")
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
        GrServiceBehavior other = (GrServiceBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Behavior}. 
     * @return the Behavior represented by this proxy, never null.
     */
    @objid ("f368301c-d4f4-4eae-b725-1b4eb1d924a8")
    public Behavior getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'GrService_Behavior_owner'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ea670d07-922e-4a61-9490-e7d3eb8282b4")
    public String getGrService_Behavior_owner() {
        return this.elt.getTagValue(GrServiceBehavior.MdaTypes.GRSERVICE_BEHAVIOR_OWNER_TAGTYPE_ELT);
    }

    @objid ("920bd13e-361f-450d-b510-c2f1c523e46a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GrService_Behavior_owner'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a37ac6f9-9ad7-44d9-a4ef-bf253c3313e2")
    public void setGrService_Behavior_owner(final String value) {
        this.elt.putTagValue(GrServiceBehavior.MdaTypes.GRSERVICE_BEHAVIOR_OWNER_TAGTYPE_ELT, value);
    }

    @objid ("bd3e9e91-a390-47ca-800e-7bbee762870e")
    protected GrServiceBehavior(final Behavior elt) {
        this.elt = elt;
    }

    @objid ("8706da06-8ca9-47c7-8ae5-75bc25b0f419")
    public static final class MdaTypes {
        @objid ("ad049df7-3682-45c6-aa63-eb55c14a611c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("de324851-f41c-4572-bdc0-aebd65ce9cb3")
        public static TagType GRSERVICE_BEHAVIOR_OWNER_TAGTYPE_ELT;

        @objid ("4c5ee3c9-276d-4032-b5ac-2daeeee96463")
        private static Stereotype MDAASSOCDEP;

        @objid ("b4476f6d-a75c-4477-8f5c-39e618f44b4c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("27068da4-a11b-4e81-bd35-856c9f3a27f3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b8f6af0d-0f4a-11df-8c52-0014222a9f79");
            GRSERVICE_BEHAVIOR_OWNER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c36c1fdb-0f4a-11df-8c52-0014222a9f79");
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
