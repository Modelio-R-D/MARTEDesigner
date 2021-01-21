/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_rsm.infrastructure.dependency;

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
import org.modelio.module.marte.api.marte_marte_foundations_alloc.infrastructure.dependency.AllocateDependency;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << Distribute_Dependency >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f2279445-945f-4a25-945a-7ca57216aa0d")
public class DistributeDependency extends AllocateDependency {
    @objid ("21d458fa-470b-4932-be32-ca57f5073fa2")
    public static final String STEREOTYPE_NAME = "Distribute_Dependency";

    @objid ("dcab7468-6f88-43fd-9dfa-6e0cbb75c527")
    public static final String DISTRIBUTE_DEPENDENCY_FROMTILER_FITTING_TAGTYPE = "Distribute_Dependency_fromTiler_fitting";

    @objid ("37235609-ca93-4ae9-bd44-dc060b9d0831")
    public static final String DISTRIBUTE_DEPENDENCY_FROMTILER_ORIGIN_TAGTYPE = "Distribute_Dependency_fromTiler_origin";

    @objid ("0f929c98-5085-4608-807a-9bc711f7e229")
    public static final String DISTRIBUTE_DEPENDENCY_FROMTILER_PAVING_TAGTYPE = "Distribute_Dependency_fromTiler_paving";

    @objid ("cd4b2663-c388-41be-b57c-be29242abdf8")
    public static final String DISTRIBUTE_DEPENDENCY_PATTERNSHAPE_TAGTYPE = "Distribute_Dependency_patternShape";

    @objid ("5b259178-2476-46b6-99dd-3c1a0ee0c813")
    public static final String DISTRIBUTE_DEPENDENCY_REPETITIONSPACE_TAGTYPE = "Distribute_Dependency_repetitionSpace";

    @objid ("a82ebf46-dcf0-4851-bd02-d4d21e124a64")
    public static final String DISTRIBUTE_DEPENDENCY_TOTILER_FITTING_TAGTYPE = "Distribute_Dependency_toTiler_fitting";

    @objid ("e6782e86-dc21-4306-9f27-430ba0269b39")
    public static final String DISTRIBUTE_DEPENDENCY_TOTILER_ORIGIN_TAGTYPE = "Distribute_Dependency_toTiler_origin";

    @objid ("57624c75-8c7a-46ee-ade7-8409cb8e7673")
    public static final String DISTRIBUTE_DEPENDENCY_TOTILER_PAVING_TAGTYPE = "Distribute_Dependency_toTiler_paving";

    /**
     * Tells whether a {@link DistributeDependency proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << Distribute_Dependency >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1d2a4065-7d00-4931-84ec-d5e00e8e83f4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DistributeDependency.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << Distribute_Dependency >> then instantiate a {@link DistributeDependency} proxy.
     * 
     * @return a {@link DistributeDependency} proxy on the created {@link Dependency}.
     */
    @objid ("a544d206-8349-4d01-a66c-39e31ce34d32")
    public static DistributeDependency create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DistributeDependency.STEREOTYPE_NAME);
        return DistributeDependency.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link DistributeDependency} proxy from a {@link Dependency} stereotyped << Distribute_Dependency >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link DistributeDependency} proxy or <i>null</i>.
     */
    @objid ("bf4bba1d-d0d3-4163-9b51-b98b114c8343")
    public static DistributeDependency instantiate(final Dependency obj) {
        return DistributeDependency.canInstantiate(obj) ? new DistributeDependency(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DistributeDependency} proxy from a {@link Dependency} stereotyped << Distribute_Dependency >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link DistributeDependency} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("854fdc15-4f85-43bd-a852-b4983ede3909")
    public static DistributeDependency safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (DistributeDependency.canInstantiate(obj))
        	return new DistributeDependency(obj);
        else
        	throw new IllegalArgumentException("DistributeDependency: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("36d6babb-1a23-4c5f-afd4-bf9693e98e72")
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
        DistributeDependency other = (DistributeDependency) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'Distribute_Dependency_fromTiler_fitting'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("52b19a2a-c711-4074-8b67-4978b0fb312d")
    public String getDistribute_Dependency_fromTiler_fitting() {
        return this.elt.getTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_FROMTILER_FITTING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Distribute_Dependency_fromTiler_origin'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f8cda666-6fe7-44fd-bdff-747d00033ce5")
    public String getDistribute_Dependency_fromTiler_origin() {
        return this.elt.getTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_FROMTILER_ORIGIN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Distribute_Dependency_fromTiler_paving'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1437b4e3-2970-4b7b-a15b-7026e799aad9")
    public String getDistribute_Dependency_fromTiler_paving() {
        return this.elt.getTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_FROMTILER_PAVING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Distribute_Dependency_patternShape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("30d132d2-7377-46c9-9217-0d55e77325dd")
    public String getDistribute_Dependency_patternShape() {
        return this.elt.getTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_PATTERNSHAPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Distribute_Dependency_repetitionSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9a6e5be2-9b32-4614-a718-a86484f6f596")
    public String getDistribute_Dependency_repetitionSpace() {
        return this.elt.getTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_REPETITIONSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Distribute_Dependency_toTiler_fitting'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2353e2b0-880d-4864-852c-3eaca78ea5ab")
    public String getDistribute_Dependency_toTiler_fitting() {
        return this.elt.getTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_TOTILER_FITTING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Distribute_Dependency_toTiler_origin'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4ac82974-f628-47c1-9050-3795d62b4ce3")
    public String getDistribute_Dependency_toTiler_origin() {
        return this.elt.getTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_TOTILER_ORIGIN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Distribute_Dependency_toTiler_paving'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aa31ee9e-a3ea-4c81-96c6-df04efbfcd18")
    public String getDistribute_Dependency_toTiler_paving() {
        return this.elt.getTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_TOTILER_PAVING_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("cbb1cf58-02cd-4604-ade5-66e5592c86cb")
    @Override
    public Dependency getElement() {
        return (Dependency)super.getElement();
    }

    @objid ("298088ae-211d-48f9-98e8-92e72fe62de4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Distribute_Dependency_fromTiler_fitting'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("31311f09-0d01-4aac-903b-5d4f2cb39076")
    public void setDistribute_Dependency_fromTiler_fitting(final String value) {
        this.elt.putTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_FROMTILER_FITTING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Distribute_Dependency_fromTiler_origin'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b8522f22-ab5c-49af-bf68-4211cd9bc9fa")
    public void setDistribute_Dependency_fromTiler_origin(final String value) {
        this.elt.putTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_FROMTILER_ORIGIN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Distribute_Dependency_fromTiler_paving'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b35afee2-c683-4522-80c4-b4319e79d3bd")
    public void setDistribute_Dependency_fromTiler_paving(final String value) {
        this.elt.putTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_FROMTILER_PAVING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Distribute_Dependency_patternShape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c37ed569-43c7-42fd-b7d6-bc8cd6e4083c")
    public void setDistribute_Dependency_patternShape(final String value) {
        this.elt.putTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_PATTERNSHAPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Distribute_Dependency_repetitionSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f2a0a028-ff92-4cb8-af9e-3457f8c80126")
    public void setDistribute_Dependency_repetitionSpace(final String value) {
        this.elt.putTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_REPETITIONSPACE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Distribute_Dependency_toTiler_fitting'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("adb2d25e-626d-4639-8a8c-88ba3ef00146")
    public void setDistribute_Dependency_toTiler_fitting(final String value) {
        this.elt.putTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_TOTILER_FITTING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Distribute_Dependency_toTiler_origin'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a96df6a9-39ae-4539-a0de-54544c846829")
    public void setDistribute_Dependency_toTiler_origin(final String value) {
        this.elt.putTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_TOTILER_ORIGIN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Distribute_Dependency_toTiler_paving'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("68749791-a9a3-4eab-80b2-39106d1fbcfa")
    public void setDistribute_Dependency_toTiler_paving(final String value) {
        this.elt.putTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_TOTILER_PAVING_TAGTYPE_ELT, value);
    }

    @objid ("a6186ea8-c566-4348-b24e-751d740333c2")
    protected DistributeDependency(final Dependency elt) {
        super(elt);
    }

    @objid ("4aa1f3b6-54ba-4666-b34a-e9b27025ae0a")
    public static final class MdaTypes {
        @objid ("41e0c739-c2fe-4966-9eef-e4b5bbf18437")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8aa95d8a-1f76-4c16-8563-3b463c3b8fc2")
        public static TagType DISTRIBUTE_DEPENDENCY_PATTERNSHAPE_TAGTYPE_ELT;

        @objid ("2284dfa5-3d51-493e-b347-d0e5835ee047")
        public static TagType DISTRIBUTE_DEPENDENCY_REPETITIONSPACE_TAGTYPE_ELT;

        @objid ("2fbdd752-dce2-4dd0-94e9-ceee1c8ef8ed")
        public static TagType DISTRIBUTE_DEPENDENCY_FROMTILER_ORIGIN_TAGTYPE_ELT;

        @objid ("56bcf9c2-5cbf-4185-9d49-2f21f2717983")
        public static TagType DISTRIBUTE_DEPENDENCY_TOTILER_ORIGIN_TAGTYPE_ELT;

        @objid ("efcd9e54-9612-4f35-bc58-7c8012224409")
        public static TagType DISTRIBUTE_DEPENDENCY_FROMTILER_PAVING_TAGTYPE_ELT;

        @objid ("29952524-23e7-452c-8323-17b51b34da68")
        public static TagType DISTRIBUTE_DEPENDENCY_TOTILER_PAVING_TAGTYPE_ELT;

        @objid ("94ade5f9-3473-48ed-a482-08cb56297c21")
        public static TagType DISTRIBUTE_DEPENDENCY_FROMTILER_FITTING_TAGTYPE_ELT;

        @objid ("3a177c2e-94ab-4333-b9ec-e34ca03cfbb4")
        public static TagType DISTRIBUTE_DEPENDENCY_TOTILER_FITTING_TAGTYPE_ELT;

        @objid ("2505c65a-026c-476c-b658-2d0098ee0ace")
        private static Stereotype MDAASSOCDEP;

        @objid ("b07c4387-01cd-4c9c-9c80-18293f626238")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("19f7eedd-ce8d-45ea-a5ff-21591790a794")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03d5c9f4-0ccf-11df-8525-001302895b2b");
            DISTRIBUTE_DEPENDENCY_PATTERNSHAPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d5c9f6-0ccf-11df-8525-001302895b2b");
            DISTRIBUTE_DEPENDENCY_REPETITIONSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d5c9f8-0ccf-11df-8525-001302895b2b");
            DISTRIBUTE_DEPENDENCY_FROMTILER_ORIGIN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d5c9fa-0ccf-11df-8525-001302895b2b");
            DISTRIBUTE_DEPENDENCY_TOTILER_ORIGIN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d5c9fc-0ccf-11df-8525-001302895b2b");
            DISTRIBUTE_DEPENDENCY_FROMTILER_PAVING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "42576d58-6371-433f-94ac-66fd191fcddf");
            DISTRIBUTE_DEPENDENCY_TOTILER_PAVING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "35442f11-c178-4b45-9340-0535f216d5c6");
            DISTRIBUTE_DEPENDENCY_FROMTILER_FITTING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0cebe81e-69ee-402e-a3e0-dc30590cf7a7");
            DISTRIBUTE_DEPENDENCY_TOTILER_FITTING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b0dfef64-b0b5-4d4a-9ded-3654584c54e6");
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
