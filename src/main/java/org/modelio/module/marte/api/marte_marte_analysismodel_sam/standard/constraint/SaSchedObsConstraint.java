/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.constraint;

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
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.constraint.GaTimedObsConstraint;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Constraint} with << SaSchedObs_Constraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("103cb79a-2e2b-47a1-a410-7e51c6e35a8d")
public class SaSchedObsConstraint extends GaTimedObsConstraint {
    @objid ("efa9bf6b-5c73-49a3-b05f-040d83ecb68b")
    public static final String STEREOTYPE_NAME = "SaSchedObs_Constraint";

    @objid ("d81d2e48-fa1b-4b5a-9558-269cadf23141")
    public static final String SASCHEDOBS_CONSTRAINT_BLOCKT_TAGTYPE = "SaSchedObs_Constraint_blockT";

    @objid ("a6f24271-d15e-4e12-9193-4aeffc367986")
    public static final String SASCHEDOBS_CONSTRAINT_OVERLAPS_TAGTYPE = "SaSchedObs_Constraint_overlaps";

    @objid ("fccb8396-073a-405c-acaf-44554d472959")
    public static final String SASCHEDOBS_CONSTRAINT_SUSPENTIONS_TAGTYPE = "SaSchedObs_Constraint_suspentions";

    /**
     * Tells whether a {@link SaSchedObsConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << SaSchedObs_Constraint >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c764a859-ec1e-49f9-a21c-98cc54a397b6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaSchedObsConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << SaSchedObs_Constraint >> then instantiate a {@link SaSchedObsConstraint} proxy.
     * 
     * @return a {@link SaSchedObsConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("2538a2a4-3533-46fa-88b8-861682c2eee5")
    public static SaSchedObsConstraint create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Constraint");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaSchedObsConstraint.STEREOTYPE_NAME);
        return SaSchedObsConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link SaSchedObsConstraint} proxy from a {@link Constraint} stereotyped << SaSchedObs_Constraint >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link SaSchedObsConstraint} proxy or <i>null</i>.
     */
    @objid ("3b39ea47-a237-458c-bec9-7e14747319cf")
    public static SaSchedObsConstraint instantiate(final Constraint obj) {
        return SaSchedObsConstraint.canInstantiate(obj) ? new SaSchedObsConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaSchedObsConstraint} proxy from a {@link Constraint} stereotyped << SaSchedObs_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link SaSchedObsConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f394c2c8-4edb-4752-a62a-15a615336c5a")
    public static SaSchedObsConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (SaSchedObsConstraint.canInstantiate(obj))
        	return new SaSchedObsConstraint(obj);
        else
        	throw new IllegalArgumentException("SaSchedObsConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4aa2ac8c-6bf9-4d91-9fda-067fc5e8b4e3")
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
        SaSchedObsConstraint other = (SaSchedObsConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("1177d8d4-ecf8-4aba-9c73-2d830a053373")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Getter for List<String> property 'SaSchedObs_Constraint_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5d32a14a-23f8-4b87-8aee-69d187a5c2b8")
    public List<String> getSaSchedObs_Constraint_blockT() {
        return this.elt.getTagValues(SaSchedObsConstraint.MdaTypes.SASCHEDOBS_CONSTRAINT_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaSchedObs_Constraint_overlaps'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a7b8d00c-90e5-4f7e-a537-40b57af22429")
    public List<String> getSaSchedObs_Constraint_overlaps() {
        return this.elt.getTagValues(SaSchedObsConstraint.MdaTypes.SASCHEDOBS_CONSTRAINT_OVERLAPS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaSchedObs_Constraint_suspentions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a28dc61c-4c05-4c83-a609-8061d4f1bdac")
    public List<String> getSaSchedObs_Constraint_suspentions() {
        return this.elt.getTagValues(SaSchedObsConstraint.MdaTypes.SASCHEDOBS_CONSTRAINT_SUSPENTIONS_TAGTYPE_ELT);
    }

    @objid ("ecd4430a-4f08-46f3-aa86-b3b1b1198242")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SaSchedObs_Constraint_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("371a66ea-ddd0-461d-b36a-e8ae90d9769a")
    public void setSaSchedObs_Constraint_blockT(final List<String> values) {
        this.elt.putTagValues(SaSchedObsConstraint.MdaTypes.SASCHEDOBS_CONSTRAINT_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SaSchedObs_Constraint_overlaps'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("023be6f9-9693-4189-b260-bbc1a48a6f19")
    public void setSaSchedObs_Constraint_overlaps(final List<String> values) {
        this.elt.putTagValues(SaSchedObsConstraint.MdaTypes.SASCHEDOBS_CONSTRAINT_OVERLAPS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SaSchedObs_Constraint_suspentions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f24ea694-79f3-4f86-9f60-3c4072dfb15e")
    public void setSaSchedObs_Constraint_suspentions(final List<String> values) {
        this.elt.putTagValues(SaSchedObsConstraint.MdaTypes.SASCHEDOBS_CONSTRAINT_SUSPENTIONS_TAGTYPE_ELT, values);
    }

    @objid ("390f4871-49a4-4cf5-8143-b83f0e53b53b")
    protected SaSchedObsConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("5096b69e-77b1-45c3-909d-b3688fe27784")
    public static final class MdaTypes {
        @objid ("7212dbe8-104a-45ea-9117-e32d81442006")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("02e5d24e-441b-40b4-acd6-1e24e8decf30")
        public static TagType SASCHEDOBS_CONSTRAINT_SUSPENTIONS_TAGTYPE_ELT;

        @objid ("e90f41cd-c1b6-45cc-8a14-38754479d173")
        public static TagType SASCHEDOBS_CONSTRAINT_BLOCKT_TAGTYPE_ELT;

        @objid ("b4b2dd17-7d51-403d-92bb-1899eb593fdf")
        public static TagType SASCHEDOBS_CONSTRAINT_OVERLAPS_TAGTYPE_ELT;

        @objid ("eb941280-7497-408c-aca7-1ca81fc7df93")
        private static Stereotype MDAASSOCDEP;

        @objid ("41069f65-2730-45fd-9ee6-908fd85898a5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("29121905-1688-4e6c-a728-8d15b12e82d3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03930906-0ccf-11df-8525-001302895b2b");
            SASCHEDOBS_CONSTRAINT_SUSPENTIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03930908-0ccf-11df-8525-001302895b2b");
            SASCHEDOBS_CONSTRAINT_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0393090a-0ccf-11df-8525-001302895b2b");
            SASCHEDOBS_CONSTRAINT_OVERLAPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0393090c-0ccf-11df-8525-001302895b2b");
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
