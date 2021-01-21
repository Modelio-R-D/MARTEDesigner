/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.association;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwProcessor_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8a917327-42dc-42bf-9769-145d3c26c273")
public class HwProcessorAssociation extends HwComputingResourceAssociation {
    @objid ("56cb2e51-98ab-4d7e-bbf4-459e1195dcba")
    public static final String STEREOTYPE_NAME = "HwProcessor_Association";

    @objid ("85b65b1e-ed7e-470d-a4fa-34639955cbcf")
    public static final String HWPROCESSOR_ASSOCIATION_ARCHITECTURE_TAGTYPE = "HwProcessor_Association_architecture";

    @objid ("2915eaa7-3339-457c-9143-6c219b6ff343")
    public static final String HWPROCESSOR_ASSOCIATION_CACHES_TAGTYPE = "HwProcessor_Association_caches";

    @objid ("10dfab12-947a-44c9-ab55-936e341d6f7b")
    public static final String HWPROCESSOR_ASSOCIATION_IPC_TAGTYPE = "HwProcessor_Association_ipc";

    @objid ("cadd7956-f6fd-4b9b-a433-881f0a11fb98")
    public static final String HWPROCESSOR_ASSOCIATION_MIPS_TAGTYPE = "HwProcessor_Association_mips";

    @objid ("069f2a08-d66d-4e26-955d-792125966623")
    public static final String HWPROCESSOR_ASSOCIATION_NBALUS_TAGTYPE = "HwProcessor_Association_nbALUs";

    @objid ("efc07601-5655-4d2a-bd74-cfcabdd028e1")
    public static final String HWPROCESSOR_ASSOCIATION_NBCORES_TAGTYPE = "HwProcessor_Association_nbCores";

    @objid ("6c612d29-07cd-459f-a93f-f597795c7563")
    public static final String HWPROCESSOR_ASSOCIATION_NBFPUS_TAGTYPE = "HwProcessor_Association_nbFPUs";

    @objid ("b1505bcb-1dbf-4f7a-94fb-2a11a7a42fa7")
    public static final String HWPROCESSOR_ASSOCIATION_NBPIPELINES_TAGTYPE = "HwProcessor_Association_nbPipelines";

    @objid ("b8b07235-4217-4f37-a054-570fa2d52c5d")
    public static final String HWPROCESSOR_ASSOCIATION_NBSTAGES_TAGTYPE = "HwProcessor_Association_nbStages";

    @objid ("346aec74-1e76-49e0-a9ec-fbf3e948f39c")
    public static final String HWPROCESSOR_ASSOCIATION_OWNEDISAS_TAGTYPE = "HwProcessor_Association_ownedISAs";

    @objid ("cd917bdc-89d9-4313-9731-1b641b9b8421")
    public static final String HWPROCESSOR_ASSOCIATION_OWNEDMMUS_TAGTYPE = "HwProcessor_Association_ownedMMUs";

    @objid ("5c611c65-8e8c-4cef-9694-69f1de746f84")
    public static final String HWPROCESSOR_ASSOCIATION_PREDICTORS_TAGTYPE = "HwProcessor_Association_predictors";

    /**
     * Tells whether a {@link HwProcessorAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwProcessor_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("712bde82-ded9-4a35-8b5f-8db936149fec")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwProcessor_Association >> then instantiate a {@link HwProcessorAssociation} proxy.
     * 
     * @return a {@link HwProcessorAssociation} proxy on the created {@link Association}.
     */
    @objid ("9b1212a8-83cc-418f-9524-c04167b410f1")
    public static HwProcessorAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorAssociation.STEREOTYPE_NAME);
        return HwProcessorAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwProcessorAssociation} proxy from a {@link Association} stereotyped << HwProcessor_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwProcessorAssociation} proxy or <i>null</i>.
     */
    @objid ("f1d0abd4-37ef-4255-be57-a81f338ebd4b")
    public static HwProcessorAssociation instantiate(final Association obj) {
        return HwProcessorAssociation.canInstantiate(obj) ? new HwProcessorAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwProcessorAssociation} proxy from a {@link Association} stereotyped << HwProcessor_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwProcessorAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d2bd510a-e440-401d-a238-28a05933fc8b")
    public static HwProcessorAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwProcessorAssociation.canInstantiate(obj))
        	return new HwProcessorAssociation(obj);
        else
        	throw new IllegalArgumentException("HwProcessorAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9bb2adb8-25fb-4f1a-b72c-765cffca9f27")
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
        HwProcessorAssociation other = (HwProcessorAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("d8c9f9bf-7bbb-445a-bbe5-99b65125fe3a")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwProcessor_Association_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c24dfb51-a319-4679-81df-7082f861b798")
    public String getHwProcessor_Association_architecture() {
        return this.elt.getTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_ARCHITECTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Association_caches'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("74d0c0c0-7c0f-4fec-a4e4-448e5adc90c7")
    public List<String> getHwProcessor_Association_caches() {
        return this.elt.getTagValues(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_CACHES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Association_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c6519bc6-cfe1-4684-b98d-7f8d557d28af")
    public String getHwProcessor_Association_ipc() {
        return this.elt.getTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_IPC_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Association_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("477643f6-59ab-45a4-b1a6-91e9b94890e8")
    public String getHwProcessor_Association_mips() {
        return this.elt.getTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_MIPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Association_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d71f5a0b-9587-4c0d-95a7-ff7fa82f8ee3")
    public String getHwProcessor_Association_nbALUs() {
        return this.elt.getTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_NBALUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Association_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("07c7ee04-5f3a-4d13-8561-1056f69817a7")
    public String getHwProcessor_Association_nbCores() {
        return this.elt.getTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_NBCORES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Association_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8ae68049-3f04-4822-ac4c-035c3813e8df")
    public String getHwProcessor_Association_nbFPUs() {
        return this.elt.getTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_NBFPUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Association_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("164fdd15-1b58-42e7-ad47-2f7c95623b89")
    public String getHwProcessor_Association_nbPipelines() {
        return this.elt.getTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_NBPIPELINES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Association_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dc5f6373-7f60-44af-928b-0aa2a015d2a7")
    public String getHwProcessor_Association_nbStages() {
        return this.elt.getTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_NBSTAGES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Association_ownedISAs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2c18027f-4d3e-4070-903b-823e468dc5be")
    public List<String> getHwProcessor_Association_ownedISAs() {
        return this.elt.getTagValues(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_OWNEDISAS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Association_ownedMMUs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a1cd14c2-f2af-4273-bf0a-37820437f95c")
    public List<String> getHwProcessor_Association_ownedMMUs() {
        return this.elt.getTagValues(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_OWNEDMMUS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Association_predictors'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b3384798-e244-4401-b0c8-45b501d38807")
    public List<String> getHwProcessor_Association_predictors() {
        return this.elt.getTagValues(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_PREDICTORS_TAGTYPE_ELT);
    }

    @objid ("12895fa9-e899-4677-ae83-92cdd87f8c68")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwProcessor_Association_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("087f39f5-170f-4cc8-a6ca-220d4011a2a1")
    public void setHwProcessor_Association_architecture(final String value) {
        this.elt.putTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_ARCHITECTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Association_caches'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c8818d08-3b77-4b57-9d32-718637b0ee87")
    public void setHwProcessor_Association_caches(final List<String> values) {
        this.elt.putTagValues(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_CACHES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwProcessor_Association_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6ac4648c-ec3f-4db3-b818-9eb6fc99c2e1")
    public void setHwProcessor_Association_ipc(final String value) {
        this.elt.putTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_IPC_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Association_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3b8b5050-1aee-4ca1-b273-c18fc1faed47")
    public void setHwProcessor_Association_mips(final String value) {
        this.elt.putTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_MIPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Association_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4eea8283-f1f0-4e0a-b7a3-42d3d62301e3")
    public void setHwProcessor_Association_nbALUs(final String value) {
        this.elt.putTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_NBALUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Association_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("85273e27-adf2-437d-bc69-84a49b40bff1")
    public void setHwProcessor_Association_nbCores(final String value) {
        this.elt.putTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_NBCORES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Association_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7d5c8c1e-ee98-4ec4-a2d8-c8d9a067df4c")
    public void setHwProcessor_Association_nbFPUs(final String value) {
        this.elt.putTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_NBFPUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Association_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8e660953-60e6-4f57-9fa5-f2f948a516e7")
    public void setHwProcessor_Association_nbPipelines(final String value) {
        this.elt.putTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_NBPIPELINES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Association_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ab66e8e0-4ca2-474c-bd21-5f90d0a9f1fa")
    public void setHwProcessor_Association_nbStages(final String value) {
        this.elt.putTagValue(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_NBSTAGES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Association_ownedISAs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("58bee674-e866-484f-9114-f7e640e28d1e")
    public void setHwProcessor_Association_ownedISAs(final List<String> values) {
        this.elt.putTagValues(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_OWNEDISAS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Association_ownedMMUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4dfbf417-c164-47bf-a824-477baf5a0527")
    public void setHwProcessor_Association_ownedMMUs(final List<String> values) {
        this.elt.putTagValues(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_OWNEDMMUS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Association_predictors'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4732e5c4-5766-40c2-8270-6bb5f5ac99fd")
    public void setHwProcessor_Association_predictors(final List<String> values) {
        this.elt.putTagValues(HwProcessorAssociation.MdaTypes.HWPROCESSOR_ASSOCIATION_PREDICTORS_TAGTYPE_ELT, values);
    }

    @objid ("06ff7dd4-ecc2-40b6-92e5-f7442cabced4")
    protected HwProcessorAssociation(final Association elt) {
        super(elt);
    }

    @objid ("a39421d0-fcc6-4836-a3be-b95e6c8b12f3")
    public static final class MdaTypes {
        @objid ("816bec19-f8e6-47e6-a04a-d90b9b1795be")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5bb73c01-d588-4350-9acb-72d8ade396c7")
        public static TagType HWPROCESSOR_ASSOCIATION_ARCHITECTURE_TAGTYPE_ELT;

        @objid ("7721802f-89bb-45f5-8d9f-005e44c8c59e")
        public static TagType HWPROCESSOR_ASSOCIATION_MIPS_TAGTYPE_ELT;

        @objid ("66279527-8f79-45d3-b75a-37d9fb7d6d59")
        public static TagType HWPROCESSOR_ASSOCIATION_IPC_TAGTYPE_ELT;

        @objid ("5c566660-c2e1-4ece-abcd-62ee32f1e2fb")
        public static TagType HWPROCESSOR_ASSOCIATION_NBCORES_TAGTYPE_ELT;

        @objid ("1c8b56f6-d5e9-4ced-8fd1-bee6eee330ea")
        public static TagType HWPROCESSOR_ASSOCIATION_NBPIPELINES_TAGTYPE_ELT;

        @objid ("3eb151f2-0a22-4983-975b-d9310ed83f6a")
        public static TagType HWPROCESSOR_ASSOCIATION_NBSTAGES_TAGTYPE_ELT;

        @objid ("77802322-1c81-4b4b-b3e0-82e341a23a25")
        public static TagType HWPROCESSOR_ASSOCIATION_NBALUS_TAGTYPE_ELT;

        @objid ("09e7e4a3-2113-45a0-aa51-3d3668050a43")
        public static TagType HWPROCESSOR_ASSOCIATION_NBFPUS_TAGTYPE_ELT;

        @objid ("bca0898a-ecbe-4abb-8e38-e09c9b0c6933")
        public static TagType HWPROCESSOR_ASSOCIATION_OWNEDISAS_TAGTYPE_ELT;

        @objid ("513bcfe0-d05a-4a8a-9861-445f03ad3472")
        public static TagType HWPROCESSOR_ASSOCIATION_PREDICTORS_TAGTYPE_ELT;

        @objid ("09bbc7b6-c7b8-4e99-957e-dfd1d5aa777d")
        public static TagType HWPROCESSOR_ASSOCIATION_CACHES_TAGTYPE_ELT;

        @objid ("1d5be394-5148-4eb6-bf63-a0fc6cfed4c1")
        public static TagType HWPROCESSOR_ASSOCIATION_OWNEDMMUS_TAGTYPE_ELT;

        @objid ("d6f6e8d1-b5e6-4f2c-9a83-2fedbbaac174")
        private static Stereotype MDAASSOCDEP;

        @objid ("ae787302-120d-48ea-ae6f-ed84fda23f6b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("33efe222-04c1-4617-ad49-442170e61d44")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "087f01ce-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_ASSOCIATION_ARCHITECTURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41d07859-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_ASSOCIATION_MIPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41d0784e-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_ASSOCIATION_IPC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41d0784f-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_ASSOCIATION_NBCORES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41d07850-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_ASSOCIATION_NBPIPELINES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41d07851-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_ASSOCIATION_NBSTAGES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41d07852-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_ASSOCIATION_NBALUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41d07853-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_ASSOCIATION_NBFPUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41d07854-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_ASSOCIATION_OWNEDISAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41d07855-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_ASSOCIATION_PREDICTORS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41d07856-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_ASSOCIATION_CACHES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41d07857-10a3-11df-81d9-0014222a9f79");
            HWPROCESSOR_ASSOCIATION_OWNEDMMUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41d07858-10a3-11df-81d9-0014222a9f79");
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
