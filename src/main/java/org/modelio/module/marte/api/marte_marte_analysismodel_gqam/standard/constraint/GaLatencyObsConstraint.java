/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.constraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Constraint;
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
 * Proxy class to handle a {@link Constraint} with << GaLatencyObs_Constraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("948cff66-0900-4d8d-97f5-e679073f43c3")
public class GaLatencyObsConstraint {
    @objid ("351e2ee0-d27c-4370-a167-38d099136d7d")
    public static final String STEREOTYPE_NAME = "GaLatencyObs_Constraint";

    @objid ("473e401c-30ea-4cb2-bef8-4cb6d2dce0ac")
    public static final String GALATENCYOBS_CONSTRAINT_LATENCY_TAGTYPE = "GaLatencyObs_Constraint_latency";

    @objid ("883b4816-6fc6-48bb-b435-f437ec64530b")
    public static final String GALATENCYOBS_CONSTRAINT_MAXJITTER_TAGTYPE = "GaLatencyObs_Constraint_maxJitter";

    @objid ("de845e80-5ee3-42e1-b413-edea5bfed3ed")
    public static final String GALATENCYOBS_CONSTRAINT_MISS_TAGTYPE = "GaLatencyObs_Constraint_miss";

    @objid ("f9efe726-0a4f-425b-9758-b6848854e77c")
    public static final String GALATENCYOBS_CONSTRAINT_UTILITY_TAGTYPE = "GaLatencyObs_Constraint_utility";

    /**
     * The underlying {@link Constraint} represented by this proxy, never null.
     */
    @objid ("e8208faa-8cc4-4b63-9bbd-bcac212cf646")
    protected final Constraint elt;

    /**
     * Tells whether a {@link GaLatencyObsConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << GaLatencyObs_Constraint >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5fdca4c0-56f8-49ec-aa17-828ee78dec52")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaLatencyObsConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << GaLatencyObs_Constraint >> then instantiate a {@link GaLatencyObsConstraint} proxy.
     * 
     * @return a {@link GaLatencyObsConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("66e485e7-9c77-46e9-8348-6c7fdabb81d5")
    public static GaLatencyObsConstraint create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Constraint");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaLatencyObsConstraint.STEREOTYPE_NAME);
        return GaLatencyObsConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link GaLatencyObsConstraint} proxy from a {@link Constraint} stereotyped << GaLatencyObs_Constraint >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link GaLatencyObsConstraint} proxy or <i>null</i>.
     */
    @objid ("12ec7df0-7009-4c60-b050-44781e4743e7")
    public static GaLatencyObsConstraint instantiate(final Constraint obj) {
        return GaLatencyObsConstraint.canInstantiate(obj) ? new GaLatencyObsConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaLatencyObsConstraint} proxy from a {@link Constraint} stereotyped << GaLatencyObs_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link GaLatencyObsConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e65e9d15-0b39-4010-97c4-77a7948c3b32")
    public static GaLatencyObsConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (GaLatencyObsConstraint.canInstantiate(obj))
        	return new GaLatencyObsConstraint(obj);
        else
        	throw new IllegalArgumentException("GaLatencyObsConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a041dc09-e2ae-4022-936a-afc72896e60f")
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
        GaLatencyObsConstraint other = (GaLatencyObsConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("a2ef084b-54c7-4132-afbb-d76619cef96c")
    public Constraint getElement() {
        return this.elt;
    }

    /**
     * Getter for List<String> property 'GaLatencyObs_Constraint_latency'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f162850d-cfb3-40eb-8727-a3c9049e1200")
    public List<String> getGaLatencyObs_Constraint_latency() {
        return this.elt.getTagValues(GaLatencyObsConstraint.MdaTypes.GALATENCYOBS_CONSTRAINT_LATENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaLatencyObs_Constraint_maxJitter'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e36f48fa-49a8-4112-9371-0a0c7224610b")
    public List<String> getGaLatencyObs_Constraint_maxJitter() {
        return this.elt.getTagValues(GaLatencyObsConstraint.MdaTypes.GALATENCYOBS_CONSTRAINT_MAXJITTER_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaLatencyObs_Constraint_miss'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("00a29752-b3fd-41e9-a628-e8959fb69d04")
    public List<String> getGaLatencyObs_Constraint_miss() {
        return this.elt.getTagValues(GaLatencyObsConstraint.MdaTypes.GALATENCYOBS_CONSTRAINT_MISS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaLatencyObs_Constraint_utility'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("beab02ef-919c-4c6d-9f77-73a035469bd3")
    public String getGaLatencyObs_Constraint_utility() {
        return this.elt.getTagValue(GaLatencyObsConstraint.MdaTypes.GALATENCYOBS_CONSTRAINT_UTILITY_TAGTYPE_ELT);
    }

    @objid ("7ef12df7-0333-4c10-9c20-710c11a2f75d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'GaLatencyObs_Constraint_latency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1554d3c8-aae4-4939-8f27-cbfd19ef3d57")
    public void setGaLatencyObs_Constraint_latency(final List<String> values) {
        this.elt.putTagValues(GaLatencyObsConstraint.MdaTypes.GALATENCYOBS_CONSTRAINT_LATENCY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaLatencyObs_Constraint_maxJitter'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("86094f6b-a6ec-4f7a-ac2b-88af6580e0c4")
    public void setGaLatencyObs_Constraint_maxJitter(final List<String> values) {
        this.elt.putTagValues(GaLatencyObsConstraint.MdaTypes.GALATENCYOBS_CONSTRAINT_MAXJITTER_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'GaLatencyObs_Constraint_miss'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("145be8f4-c5cb-4934-98fa-d639093599f1")
    public void setGaLatencyObs_Constraint_miss(final List<String> values) {
        this.elt.putTagValues(GaLatencyObsConstraint.MdaTypes.GALATENCYOBS_CONSTRAINT_MISS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaLatencyObs_Constraint_utility'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2f077b29-6703-4c02-9c50-1a74dc5db36e")
    public void setGaLatencyObs_Constraint_utility(final String value) {
        this.elt.putTagValue(GaLatencyObsConstraint.MdaTypes.GALATENCYOBS_CONSTRAINT_UTILITY_TAGTYPE_ELT, value);
    }

    @objid ("c12e274e-eacc-41e9-b542-da624904743a")
    protected GaLatencyObsConstraint(final Constraint elt) {
        this.elt = elt;
    }

    @objid ("ed87be46-1a7c-4a14-9a53-2add96939219")
    public static final class MdaTypes {
        @objid ("e3521692-f26e-4c54-bc56-f27718026240")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ae0e5f53-d920-4cb0-a7e9-cbe5e67727ae")
        public static TagType GALATENCYOBS_CONSTRAINT_LATENCY_TAGTYPE_ELT;

        @objid ("6eecee62-ad8f-4275-a86e-b79ddc0f10f0")
        public static TagType GALATENCYOBS_CONSTRAINT_MISS_TAGTYPE_ELT;

        @objid ("0477f845-e648-4a18-b4e5-b39cb06287b1")
        public static TagType GALATENCYOBS_CONSTRAINT_UTILITY_TAGTYPE_ELT;

        @objid ("4b6c2519-12b5-486c-953d-3e9e7e4e32a3")
        public static TagType GALATENCYOBS_CONSTRAINT_MAXJITTER_TAGTYPE_ELT;

        @objid ("99df3042-ee8c-478c-8027-1a9d90c9ebc6")
        private static Stereotype MDAASSOCDEP;

        @objid ("d34a189d-fa73-46b5-a13d-d4d00abf867d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8c88c001-0024-4721-b22b-0da9e482f2b2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "035e95f1-0ccf-11df-8525-001302895b2b");
            GALATENCYOBS_CONSTRAINT_LATENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "035e95f3-0ccf-11df-8525-001302895b2b");
            GALATENCYOBS_CONSTRAINT_MISS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "035e95f5-0ccf-11df-8525-001302895b2b");
            GALATENCYOBS_CONSTRAINT_UTILITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "035e95f7-0ccf-11df-8525-001302895b2b");
            GALATENCYOBS_CONSTRAINT_MAXJITTER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "035e95f9-0ccf-11df-8525-001302895b2b");
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
