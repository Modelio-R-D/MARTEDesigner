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
 * Proxy class to handle a {@link Constraint} with << GaTimedObs_Constraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8cda9ec5-7240-42d6-b6a5-115a7141c665")
public class GaTimedObsConstraint {
    @objid ("62b99a9e-28a1-4f1c-b8fb-5cc9865c4264")
    public static final String STEREOTYPE_NAME = "GaTimedObs_Constraint";

    @objid ("0d1dcfff-16cf-4aa0-89c6-e3c573210818")
    public static final String GATIMEDOBS_CONSTRAINT_ENDOBS_TAGTYPE = "GaTimedObs_Constraint_endObs";

    @objid ("d3db4f33-da89-4c89-8e0b-0d9287afe5a2")
    public static final String GATIMEDOBS_CONSTRAINT_LAXITY_TAGTYPE = "GaTimedObs_Constraint_laxity";

    @objid ("52c3f3d4-f145-429c-80c7-ec5380dbc96f")
    public static final String GATIMEDOBS_CONSTRAINT_STARTOBS_TAGTYPE = "GaTimedObs_Constraint_startObs";

    /**
     * The underlying {@link Constraint} represented by this proxy, never null.
     */
    @objid ("45cc2d7e-fb9c-4d7b-b2d9-0408fc4c82c8")
    protected final Constraint elt;

    /**
     * Tells whether a {@link GaTimedObsConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << GaTimedObs_Constraint >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4d1d365f-6109-4aa0-a2a1-c0f0ce3fbbe4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaTimedObsConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << GaTimedObs_Constraint >> then instantiate a {@link GaTimedObsConstraint} proxy.
     * 
     * @return a {@link GaTimedObsConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("cacd8f9e-8d86-4220-937f-978cea240990")
    public static GaTimedObsConstraint create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Constraint");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaTimedObsConstraint.STEREOTYPE_NAME);
        return GaTimedObsConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link GaTimedObsConstraint} proxy from a {@link Constraint} stereotyped << GaTimedObs_Constraint >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link GaTimedObsConstraint} proxy or <i>null</i>.
     */
    @objid ("2d61d09e-1ed7-4386-9454-b8d59597d197")
    public static GaTimedObsConstraint instantiate(final Constraint obj) {
        return GaTimedObsConstraint.canInstantiate(obj) ? new GaTimedObsConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaTimedObsConstraint} proxy from a {@link Constraint} stereotyped << GaTimedObs_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link GaTimedObsConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("450b5314-caad-4593-b66d-ff00b40ae7ec")
    public static GaTimedObsConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (GaTimedObsConstraint.canInstantiate(obj))
        	return new GaTimedObsConstraint(obj);
        else
        	throw new IllegalArgumentException("GaTimedObsConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f3c92843-2e64-4f9d-9473-e76b1a718575")
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
        GaTimedObsConstraint other = (GaTimedObsConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("1054b906-3ef7-47c4-8f53-76710b0bf4c7")
    public Constraint getElement() {
        return this.elt;
    }

    /**
     * Getter for List<String> property 'GaTimedObs_Constraint_endObs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9b931a5d-9be0-48d0-8764-a366a349f2e2")
    public List<String> getGaTimedObs_Constraint_endObs() {
        return this.elt.getTagValues(GaTimedObsConstraint.MdaTypes.GATIMEDOBS_CONSTRAINT_ENDOBS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaTimedObs_Constraint_laxity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2fa15b8d-7772-4a86-bfc9-3fa1db722f73")
    public String getGaTimedObs_Constraint_laxity() {
        return this.elt.getTagValue(GaTimedObsConstraint.MdaTypes.GATIMEDOBS_CONSTRAINT_LAXITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaTimedObs_Constraint_startObs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("48b7d20b-9322-4e18-ba07-970712c188bb")
    public List<String> getGaTimedObs_Constraint_startObs() {
        return this.elt.getTagValues(GaTimedObsConstraint.MdaTypes.GATIMEDOBS_CONSTRAINT_STARTOBS_TAGTYPE_ELT);
    }

    @objid ("00e4a72a-6e23-4385-a2de-ad834a77ad6e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'GaTimedObs_Constraint_endObs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a5cad9a0-a4fb-476f-a169-30f08f1eae97")
    public void setGaTimedObs_Constraint_endObs(final List<String> values) {
        this.elt.putTagValues(GaTimedObsConstraint.MdaTypes.GATIMEDOBS_CONSTRAINT_ENDOBS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'GaTimedObs_Constraint_laxity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("39ab05cd-a6ee-409a-86b7-85974a61da0e")
    public void setGaTimedObs_Constraint_laxity(final String value) {
        this.elt.putTagValue(GaTimedObsConstraint.MdaTypes.GATIMEDOBS_CONSTRAINT_LAXITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaTimedObs_Constraint_startObs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("03855c12-5f5d-46c6-889f-c82b2e0f674d")
    public void setGaTimedObs_Constraint_startObs(final List<String> values) {
        this.elt.putTagValues(GaTimedObsConstraint.MdaTypes.GATIMEDOBS_CONSTRAINT_STARTOBS_TAGTYPE_ELT, values);
    }

    @objid ("e968bc56-0ef7-47be-9f02-4ee8ccf40157")
    protected GaTimedObsConstraint(final Constraint elt) {
        this.elt = elt;
    }

    @objid ("7cb76a89-3b4a-4352-8f48-dea34442e4ea")
    public static final class MdaTypes {
        @objid ("dce2ceb3-f502-44a4-90f1-94a64b07c776")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d156f0b5-0378-4d30-888e-492e44dd207e")
        public static TagType GATIMEDOBS_CONSTRAINT_LAXITY_TAGTYPE_ELT;

        @objid ("c497ba6c-0e6a-488f-a0ec-b6cca9095758")
        public static TagType GATIMEDOBS_CONSTRAINT_STARTOBS_TAGTYPE_ELT;

        @objid ("77c975dd-a6f8-4a2e-9a49-59eb5aa74acc")
        public static TagType GATIMEDOBS_CONSTRAINT_ENDOBS_TAGTYPE_ELT;

        @objid ("1d738af0-8a02-4c18-9689-89501fc404d2")
        private static Stereotype MDAASSOCDEP;

        @objid ("45fb4d58-d2a9-48c0-9ce0-d46b54b3f02a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("94a7eda2-af1c-47d8-8327-2b008099a01d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "035c33a1-0ccf-11df-8525-001302895b2b");
            GATIMEDOBS_CONSTRAINT_LAXITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "035c33a3-0ccf-11df-8525-001302895b2b");
            GATIMEDOBS_CONSTRAINT_STARTOBS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "035c33a5-0ccf-11df-8525-001302895b2b");
            GATIMEDOBS_CONSTRAINT_ENDOBS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "035c33a7-0ccf-11df-8525-001302895b2b");
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
