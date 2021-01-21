/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwProcessor_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("15703321-77fb-44c1-812c-87b8fbd4c280")
public class HwProcessorAttribute extends HwComputingResourceAttribute {
    @objid ("a2e8e3d2-9282-4efd-8bf7-3c6190633dcf")
    public static final String STEREOTYPE_NAME = "HwProcessor_Attribute";

    @objid ("a4f3de56-8bc5-437b-9489-ad5fdb80b180")
    public static final String HWPROCESSOR_ATTRIBUTE_ARCHITECTURE_TAGTYPE = "HwProcessor_Attribute_architecture";

    @objid ("3750de7b-1203-41d0-809c-a4beb8254e2e")
    public static final String HWPROCESSOR_ATTRIBUTE_CACHES_TAGTYPE = "HwProcessor_Attribute_caches";

    @objid ("6cbcbc7a-4a2e-413d-8ece-5aa33ed8ea64")
    public static final String HWPROCESSOR_ATTRIBUTE_IPC_TAGTYPE = "HwProcessor_Attribute_ipc";

    @objid ("5da55ed2-0da2-4268-be46-b77a02395cca")
    public static final String HWPROCESSOR_ATTRIBUTE_MIPS_TAGTYPE = "HwProcessor_Attribute_mips";

    @objid ("20df39dc-0391-45ce-b03d-6fef936a38af")
    public static final String HWPROCESSOR_ATTRIBUTE_NBALUS_TAGTYPE = "HwProcessor_Attribute_nbALUs";

    @objid ("75db8ae7-7a17-4bc5-a2f4-c8b0528c7e7a")
    public static final String HWPROCESSOR_ATTRIBUTE_NBCORES_TAGTYPE = "HwProcessor_Attribute_nbCores";

    @objid ("a8efea6b-32a5-448e-b28b-e977a93f22ca")
    public static final String HWPROCESSOR_ATTRIBUTE_NBFPUS_TAGTYPE = "HwProcessor_Attribute_nbFPUs";

    @objid ("fa8e603d-609b-495f-a68c-25241bb476c2")
    public static final String HWPROCESSOR_ATTRIBUTE_NBPIPELINES_TAGTYPE = "HwProcessor_Attribute_nbPipelines";

    @objid ("3ab91f0f-e3b0-4cec-a241-289108c5fb9d")
    public static final String HWPROCESSOR_ATTRIBUTE_NBSTAGES_TAGTYPE = "HwProcessor_Attribute_nbStages";

    @objid ("8776ba55-9f53-4083-848e-7075f148aba2")
    public static final String HWPROCESSOR_ATTRIBUTE_OWNEDISAS_TAGTYPE = "HwProcessor_Attribute_ownedISAs";

    @objid ("2376efeb-8ff5-4f2b-a6b6-daeb794ca08e")
    public static final String HWPROCESSOR_ATTRIBUTE_OWNEDMMUS_TAGTYPE = "HwProcessor_Attribute_ownedMMUs";

    @objid ("267264f3-d4d3-47bf-a064-4e45bac1f941")
    public static final String HWPROCESSOR_ATTRIBUTE_PREDICTORS_TAGTYPE = "HwProcessor_Attribute_predictors";

    /**
     * Tells whether a {@link HwProcessorAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwProcessor_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("275cf669-c362-41d8-a43a-fbd34fd08b1b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwProcessor_Attribute >> then instantiate a {@link HwProcessorAttribute} proxy.
     * 
     * @return a {@link HwProcessorAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("6386a1da-72d4-4235-9edd-a0a3df2b6204")
    public static HwProcessorAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwProcessorAttribute.STEREOTYPE_NAME);
        return HwProcessorAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwProcessorAttribute} proxy from a {@link Attribute} stereotyped << HwProcessor_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwProcessorAttribute} proxy or <i>null</i>.
     */
    @objid ("fd35e682-d874-4bf7-9eb6-e1eb51449499")
    public static HwProcessorAttribute instantiate(final Attribute obj) {
        return HwProcessorAttribute.canInstantiate(obj) ? new HwProcessorAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwProcessorAttribute} proxy from a {@link Attribute} stereotyped << HwProcessor_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwProcessorAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f0b6c8d4-00de-4a6f-9429-cfe74ce61dce")
    public static HwProcessorAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwProcessorAttribute.canInstantiate(obj))
        	return new HwProcessorAttribute(obj);
        else
        	throw new IllegalArgumentException("HwProcessorAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("30e32d11-5a39-4a57-afe3-a728e8fd117a")
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
        HwProcessorAttribute other = (HwProcessorAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("3a7d0bc2-e1e9-4392-b169-f4f86d6e6062")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwProcessor_Attribute_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("39db510d-6d9a-4711-bf6e-b16a80a16c0a")
    public String getHwProcessor_Attribute_architecture() {
        return this.elt.getTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_ARCHITECTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Attribute_caches'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6cea2c40-fbdb-49cc-84b6-7040a1b900a0")
    public List<String> getHwProcessor_Attribute_caches() {
        return this.elt.getTagValues(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_CACHES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Attribute_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3610770d-0064-4c93-856b-cee761b8cf8e")
    public String getHwProcessor_Attribute_ipc() {
        return this.elt.getTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_IPC_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Attribute_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c17f9e4d-7eb6-4197-a630-1a68b9dc4169")
    public String getHwProcessor_Attribute_mips() {
        return this.elt.getTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_MIPS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Attribute_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("42b42de8-87d4-48a5-a4ac-57374bea73d6")
    public String getHwProcessor_Attribute_nbALUs() {
        return this.elt.getTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_NBALUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Attribute_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("acbf7353-8606-4202-96ad-fa8b4800a2d6")
    public String getHwProcessor_Attribute_nbCores() {
        return this.elt.getTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_NBCORES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Attribute_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e2e638d0-9431-4310-a9bd-499d4dc0a914")
    public String getHwProcessor_Attribute_nbFPUs() {
        return this.elt.getTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_NBFPUS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Attribute_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("95e5c341-daa7-4c9d-9f46-f850e00e60ee")
    public String getHwProcessor_Attribute_nbPipelines() {
        return this.elt.getTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_NBPIPELINES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwProcessor_Attribute_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8b1642fa-ff2c-4391-9380-c86711bd1c58")
    public String getHwProcessor_Attribute_nbStages() {
        return this.elt.getTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_NBSTAGES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Attribute_ownedISAs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("bbae02f1-aa0e-488a-b907-d43e360affef")
    public List<String> getHwProcessor_Attribute_ownedISAs() {
        return this.elt.getTagValues(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_OWNEDISAS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Attribute_ownedMMUs'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d6636760-c037-4f21-a33e-2c3094772fd7")
    public List<String> getHwProcessor_Attribute_ownedMMUs() {
        return this.elt.getTagValues(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_OWNEDMMUS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwProcessor_Attribute_predictors'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("59ef31de-48b1-4342-947d-b4f4fa514bf2")
    public List<String> getHwProcessor_Attribute_predictors() {
        return this.elt.getTagValues(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_PREDICTORS_TAGTYPE_ELT);
    }

    @objid ("2d97dc93-a219-4ba1-8e7c-52c3396c36e8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwProcessor_Attribute_architecture'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("49c657e2-563e-4b7e-a7d8-2cd1289adf31")
    public void setHwProcessor_Attribute_architecture(final String value) {
        this.elt.putTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_ARCHITECTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Attribute_caches'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ba361a65-4a42-4549-b6bd-0a93bfb4ebca")
    public void setHwProcessor_Attribute_caches(final List<String> values) {
        this.elt.putTagValues(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_CACHES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwProcessor_Attribute_ipc'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c43f6a61-47d5-4e9f-92e9-401caa04f396")
    public void setHwProcessor_Attribute_ipc(final String value) {
        this.elt.putTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_IPC_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Attribute_mips'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9dbaab00-8f23-4eb8-9fd6-66f2391988f0")
    public void setHwProcessor_Attribute_mips(final String value) {
        this.elt.putTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_MIPS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Attribute_nbALUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7067964d-7716-4d3b-a7da-19e859c29dc8")
    public void setHwProcessor_Attribute_nbALUs(final String value) {
        this.elt.putTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_NBALUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Attribute_nbCores'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("03f6f1e0-bfc1-4df4-ab0e-4704bb6d3ee7")
    public void setHwProcessor_Attribute_nbCores(final String value) {
        this.elt.putTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_NBCORES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Attribute_nbFPUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9a2aebb5-55c3-455e-939a-fb3dec605423")
    public void setHwProcessor_Attribute_nbFPUs(final String value) {
        this.elt.putTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_NBFPUS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Attribute_nbPipelines'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("57aaa447-eada-4735-a587-af3361f8e2ea")
    public void setHwProcessor_Attribute_nbPipelines(final String value) {
        this.elt.putTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_NBPIPELINES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwProcessor_Attribute_nbStages'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e2b425f5-1aa6-4937-847f-a08bd34c5bfd")
    public void setHwProcessor_Attribute_nbStages(final String value) {
        this.elt.putTagValue(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_NBSTAGES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Attribute_ownedISAs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("06b7995f-c586-470b-bbe7-4605c649b05c")
    public void setHwProcessor_Attribute_ownedISAs(final List<String> values) {
        this.elt.putTagValues(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_OWNEDISAS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Attribute_ownedMMUs'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3645e59b-4f86-4cb8-8ea7-593ce5ed18c8")
    public void setHwProcessor_Attribute_ownedMMUs(final List<String> values) {
        this.elt.putTagValues(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_OWNEDMMUS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwProcessor_Attribute_predictors'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bb943a47-449b-42e1-99f4-ff504db39e2a")
    public void setHwProcessor_Attribute_predictors(final List<String> values) {
        this.elt.putTagValues(HwProcessorAttribute.MdaTypes.HWPROCESSOR_ATTRIBUTE_PREDICTORS_TAGTYPE_ELT, values);
    }

    @objid ("81734158-1cd1-46b9-931c-6e33003426cf")
    protected HwProcessorAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("da368415-2983-408c-99c8-3a28c249b99d")
    public static final class MdaTypes {
        @objid ("1a53702b-a909-4247-bb0b-9059eae448c1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("90baa500-67fa-4623-9fba-a5807d363fd4")
        public static TagType HWPROCESSOR_ATTRIBUTE_ARCHITECTURE_TAGTYPE_ELT;

        @objid ("5574249e-1c96-40f9-bea7-22ef6bb3f608")
        public static TagType HWPROCESSOR_ATTRIBUTE_MIPS_TAGTYPE_ELT;

        @objid ("3866a716-7e54-4c32-824c-fe5cd726a5c4")
        public static TagType HWPROCESSOR_ATTRIBUTE_IPC_TAGTYPE_ELT;

        @objid ("70b3e886-c5d7-4d2e-a574-eb8856dc846e")
        public static TagType HWPROCESSOR_ATTRIBUTE_NBCORES_TAGTYPE_ELT;

        @objid ("6a44a843-3810-4d8f-9ea0-bba9a35f7b74")
        public static TagType HWPROCESSOR_ATTRIBUTE_NBPIPELINES_TAGTYPE_ELT;

        @objid ("cc222cb9-1940-4aa1-9e36-9f02774aae95")
        public static TagType HWPROCESSOR_ATTRIBUTE_NBSTAGES_TAGTYPE_ELT;

        @objid ("bea1a686-ca82-4f4c-8ac3-17a7f1d5b9f2")
        public static TagType HWPROCESSOR_ATTRIBUTE_NBALUS_TAGTYPE_ELT;

        @objid ("cd8ca657-e24c-49c7-bc36-12583cd4f7d1")
        public static TagType HWPROCESSOR_ATTRIBUTE_NBFPUS_TAGTYPE_ELT;

        @objid ("5a40079f-d672-45bd-8940-9d018cf080c1")
        public static TagType HWPROCESSOR_ATTRIBUTE_OWNEDISAS_TAGTYPE_ELT;

        @objid ("a132aa29-d37a-4ddf-a6ad-718cbedcedf3")
        public static TagType HWPROCESSOR_ATTRIBUTE_PREDICTORS_TAGTYPE_ELT;

        @objid ("bdbf5c9c-2c64-47c4-9bcc-879fa4d43de4")
        public static TagType HWPROCESSOR_ATTRIBUTE_CACHES_TAGTYPE_ELT;

        @objid ("b75acaea-10e5-4738-99c7-0ce602e94108")
        public static TagType HWPROCESSOR_ATTRIBUTE_OWNEDMMUS_TAGTYPE_ELT;

        @objid ("2fd5dcb6-f332-4c1a-b97e-4349bed49bd1")
        private static Stereotype MDAASSOCDEP;

        @objid ("43817c7e-3eae-4468-b62c-8781a6e51b19")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c6c3ccad-e219-48ba-973a-affb8b5854a1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00dae37c-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ATTRIBUTE_ARCHITECTURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae383-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ATTRIBUTE_MIPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae38a-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ATTRIBUTE_IPC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae391-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ATTRIBUTE_NBCORES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae398-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ATTRIBUTE_NBPIPELINES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dae39f-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ATTRIBUTE_NBSTAGES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45c8-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ATTRIBUTE_NBALUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45cf-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ATTRIBUTE_NBFPUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45d6-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ATTRIBUTE_OWNEDISAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45dd-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ATTRIBUTE_PREDICTORS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45e4-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ATTRIBUTE_CACHES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dd45eb-0ccf-11df-8525-001302895b2b");
            HWPROCESSOR_ATTRIBUTE_OWNEDMMUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00dfa81b-0ccf-11df-8525-001302895b2b");
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
