/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("4424d98f-dbff-4302-86a4-fa52fc10789c")
    public static final String STEREOTYPE_NAME = "Distribute_Dependency";

    @objid ("612d7826-cf9a-454f-95fe-c48ab3eecca4")
    public static final String DISTRIBUTE_DEPENDENCY_FROMTILER_FITTING_TAGTYPE = "Distribute_Dependency_fromTiler_fitting";

    @objid ("1ac03cb3-5980-4304-86dc-1168f6570228")
    public static final String DISTRIBUTE_DEPENDENCY_FROMTILER_ORIGIN_TAGTYPE = "Distribute_Dependency_fromTiler_origin";

    @objid ("5cf8e3f2-c3da-40d2-aed5-2ac4705584ba")
    public static final String DISTRIBUTE_DEPENDENCY_FROMTILER_PAVING_TAGTYPE = "Distribute_Dependency_fromTiler_paving";

    @objid ("e46a2604-e7be-46a0-86a7-69f6eccc840c")
    public static final String DISTRIBUTE_DEPENDENCY_PATTERNSHAPE_TAGTYPE = "Distribute_Dependency_patternShape";

    @objid ("df2cdde2-daed-49ea-901c-80936a376609")
    public static final String DISTRIBUTE_DEPENDENCY_REPETITIONSPACE_TAGTYPE = "Distribute_Dependency_repetitionSpace";

    @objid ("407ba23b-1c34-4c65-872b-9e21e0579b2e")
    public static final String DISTRIBUTE_DEPENDENCY_TOTILER_FITTING_TAGTYPE = "Distribute_Dependency_toTiler_fitting";

    @objid ("c6ee0f1b-9ad8-417e-9bd9-797495fa306e")
    public static final String DISTRIBUTE_DEPENDENCY_TOTILER_ORIGIN_TAGTYPE = "Distribute_Dependency_toTiler_origin";

    @objid ("0f6c9cb3-97e4-43c3-9a40-81398864a65e")
    public static final String DISTRIBUTE_DEPENDENCY_TOTILER_PAVING_TAGTYPE = "Distribute_Dependency_toTiler_paving";

    /**
     * Tells whether a {@link DistributeDependency proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << Distribute_Dependency >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e3ee10d5-71b6-46d6-a4e2-174a906950c8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DistributeDependency.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << Distribute_Dependency >> then instantiate a {@link DistributeDependency} proxy.
     * 
     * @return a {@link DistributeDependency} proxy on the created {@link Dependency}.
     */
    @objid ("122450d6-693b-421b-9693-f871a1bf5700")
    public static DistributeDependency create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DistributeDependency.STEREOTYPE_NAME);
        return DistributeDependency.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link DistributeDependency} proxy from a {@link Dependency} stereotyped << Distribute_Dependency >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link DistributeDependency} proxy or <i>null</i>.
     */
    @objid ("d6dcaca1-fe78-435e-a182-f7bf460e15a3")
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
    @objid ("57da8155-364e-4a1f-97e6-f95f58c20dfb")
    public static DistributeDependency safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (DistributeDependency.canInstantiate(obj))
        	return new DistributeDependency(obj);
        else
        	throw new IllegalArgumentException("DistributeDependency: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("20ffbe42-ac8d-4c46-b9d6-57810ffc069f")
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
    @objid ("9aaf105e-1212-4ec0-92f7-8c1ad414e83d")
    public String getDistribute_Dependency_fromTiler_fitting() {
        return this.elt.getTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_FROMTILER_FITTING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Distribute_Dependency_fromTiler_origin'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d5d24844-5248-4303-8c19-ed897a93de90")
    public String getDistribute_Dependency_fromTiler_origin() {
        return this.elt.getTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_FROMTILER_ORIGIN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Distribute_Dependency_fromTiler_paving'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e12a8516-cafa-4b1e-a48f-614a0e4bf541")
    public String getDistribute_Dependency_fromTiler_paving() {
        return this.elt.getTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_FROMTILER_PAVING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Distribute_Dependency_patternShape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1f0d0e1c-7f39-4aff-a0d9-322e0aeeeeb5")
    public String getDistribute_Dependency_patternShape() {
        return this.elt.getTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_PATTERNSHAPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Distribute_Dependency_repetitionSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bc1d9a72-bf1b-4e06-ab25-98ac24f0e3eb")
    public String getDistribute_Dependency_repetitionSpace() {
        return this.elt.getTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_REPETITIONSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Distribute_Dependency_toTiler_fitting'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7d970d7d-04dd-44b8-b16a-eb8b28c63803")
    public String getDistribute_Dependency_toTiler_fitting() {
        return this.elt.getTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_TOTILER_FITTING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Distribute_Dependency_toTiler_origin'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eb915730-fc93-414e-8f98-dce2f39553fe")
    public String getDistribute_Dependency_toTiler_origin() {
        return this.elt.getTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_TOTILER_ORIGIN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Distribute_Dependency_toTiler_paving'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9db971f2-6255-459b-b0e6-c9a436ac890f")
    public String getDistribute_Dependency_toTiler_paving() {
        return this.elt.getTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_TOTILER_PAVING_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("62a4f9e4-6ff5-4d95-b371-e045198a36af")
    @Override
    public Dependency getElement() {
        return (Dependency)super.getElement();
    }

    @objid ("be6e6825-5e20-4eab-a109-50c0b3bdc1ed")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Distribute_Dependency_fromTiler_fitting'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c393c243-6115-49ce-807b-55c0f7ab614c")
    public void setDistribute_Dependency_fromTiler_fitting(final String value) {
        this.elt.putTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_FROMTILER_FITTING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Distribute_Dependency_fromTiler_origin'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bec6acaa-6d49-4420-bd31-7a96bb40addf")
    public void setDistribute_Dependency_fromTiler_origin(final String value) {
        this.elt.putTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_FROMTILER_ORIGIN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Distribute_Dependency_fromTiler_paving'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("07786dd4-3c13-45f4-b22b-71a7d3548ced")
    public void setDistribute_Dependency_fromTiler_paving(final String value) {
        this.elt.putTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_FROMTILER_PAVING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Distribute_Dependency_patternShape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("83e8bdc5-d26c-4502-a68c-8174b74440bb")
    public void setDistribute_Dependency_patternShape(final String value) {
        this.elt.putTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_PATTERNSHAPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Distribute_Dependency_repetitionSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f0f374c4-6444-4cdd-89a7-db3765f55f41")
    public void setDistribute_Dependency_repetitionSpace(final String value) {
        this.elt.putTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_REPETITIONSPACE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Distribute_Dependency_toTiler_fitting'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c60510df-a7e2-40e4-b182-0ba9ab3f5dca")
    public void setDistribute_Dependency_toTiler_fitting(final String value) {
        this.elt.putTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_TOTILER_FITTING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Distribute_Dependency_toTiler_origin'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("521e1d18-8488-48e1-8111-9fac81f46869")
    public void setDistribute_Dependency_toTiler_origin(final String value) {
        this.elt.putTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_TOTILER_ORIGIN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Distribute_Dependency_toTiler_paving'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("24edcdab-0547-46b1-b00a-f696c5b6744e")
    public void setDistribute_Dependency_toTiler_paving(final String value) {
        this.elt.putTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_TOTILER_PAVING_TAGTYPE_ELT, value);
    }

    @objid ("1157c7b6-c64b-4fac-929f-64667004a11c")
    protected DistributeDependency(final Dependency elt) {
        super(elt);
    }

    @objid ("4aa1f3b6-54ba-4666-b34a-e9b27025ae0a")
    public static final class MdaTypes {
        @objid ("77ef2f28-2365-4d3f-bd02-c563378a1510")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("361fa4a9-1c47-44d0-afc4-bf070059fd34")
        public static TagType DISTRIBUTE_DEPENDENCY_PATTERNSHAPE_TAGTYPE_ELT;

        @objid ("7c0a5aa0-8551-4dc2-ae83-9b2f5088b35c")
        public static TagType DISTRIBUTE_DEPENDENCY_REPETITIONSPACE_TAGTYPE_ELT;

        @objid ("cfd67c17-de24-4f61-a497-7519d4968b76")
        public static TagType DISTRIBUTE_DEPENDENCY_FROMTILER_ORIGIN_TAGTYPE_ELT;

        @objid ("64dcffa9-939f-42e7-97b8-491d92b148f0")
        public static TagType DISTRIBUTE_DEPENDENCY_TOTILER_ORIGIN_TAGTYPE_ELT;

        @objid ("e62a34e4-7798-426c-a6c2-8cb339da1aee")
        public static TagType DISTRIBUTE_DEPENDENCY_FROMTILER_PAVING_TAGTYPE_ELT;

        @objid ("b7a9c437-3b33-410d-9304-11283080b381")
        public static TagType DISTRIBUTE_DEPENDENCY_TOTILER_PAVING_TAGTYPE_ELT;

        @objid ("f382a89a-53f5-4097-aa5a-52abb096331b")
        public static TagType DISTRIBUTE_DEPENDENCY_FROMTILER_FITTING_TAGTYPE_ELT;

        @objid ("fdb116b1-119c-4294-9b5e-93491c8c9798")
        public static TagType DISTRIBUTE_DEPENDENCY_TOTILER_FITTING_TAGTYPE_ELT;

        @objid ("95f84456-2efd-4640-ba0d-1037ed298df1")
        private static Stereotype MDAASSOCDEP;

        @objid ("55415a22-74bc-4862-a69f-391d90303e50")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("75b5f688-fbc0-4ee1-beec-4f37ef79ff76")
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
